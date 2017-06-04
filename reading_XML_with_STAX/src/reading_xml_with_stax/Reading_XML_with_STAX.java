package reading_xml_with_stax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Francisco Jimenez 2014
//http://www.journaldev.com/1191/java-stax-parser-example-read-xml-file

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Reading_XML_with_STAX {

    public void leer(String path) throws ClassNotFoundException, SQLException {
        String fileName = path;
        List<Employee> empList = parseXML(fileName);
        for(Employee emp : empList){
            System.out.println(emp.toString());
        }
    }

    private static List<Employee> parseXML(String fileName) throws ClassNotFoundException, SQLException {
        List<Employee> empList = new ArrayList<>();
        Employee emp = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
            PreparedStatement ps = db.DBUtils.getPreparedStatement("insert into dbo.stax values(?, ?, ?, ?)");
            while(xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                
               if (xmlEvent.isStartElement()){
                   StartElement startElement = xmlEvent.asStartElement();
                   if(startElement.getName().getLocalPart().equals("Employee")){
                       emp = new Employee();
                       //Get the 'id' attribute from Employee element
                       Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                       if(idAttr != null){
                       emp.setId(Integer.parseInt(idAttr.getValue()));
                       }
                   }
                   //set the other varibles from xml elements
                   
                   else if(startElement.getName().getLocalPart().equals("age")){
                       xmlEvent = xmlEventReader.nextEvent();
                       emp.setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
                       ps.setInt(1, emp.getAge());
                   }else if(startElement.getName().getLocalPart().equals("name")){
                       xmlEvent = xmlEventReader.nextEvent();
                       emp.setName(xmlEvent.asCharacters().getData());
                       ps.setString(2, emp.getName());
                   }else if(startElement.getName().getLocalPart().equals("gender")){
                       xmlEvent = xmlEventReader.nextEvent();
                       emp.setGender(xmlEvent.asCharacters().getData());
                       ps.setString(3, emp.getGender());
                   }else if(startElement.getName().getLocalPart().equals("role")){
                       xmlEvent = xmlEventReader.nextEvent();
                       emp.setRole(xmlEvent.asCharacters().getData());
                       ps.setString(4, emp.getRole());
                   }
                   
               }
               
               //if Employee end element is reached, add employee object to list
               if(xmlEvent.isEndElement()){
                   EndElement endElement = xmlEvent.asEndElement();
                   if(endElement.getName().getLocalPart().equals("Employee")){
                       empList.add(emp);
                   }
               }
               ps.executeUpdate();
            }
            
            
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return empList;
    }

}