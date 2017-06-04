/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reading_xml_with_dom;

/**
 *
 * @author Samil Jimenez Dickson 20142920
 * https://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
 */
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.sql.PreparedStatement;

public class Reading_XML_with_DOM {

    /**
     * @param args the command line arguments
     */
    public void leer(String path) {
       try {

	File fXmlFile = new File(path);
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);

	doc.getDocumentElement().normalize();
PreparedStatement ps = db.DBUtils.getPreparedStatement("insert into dbo.dom values(?, ?, ?, ?, ?)");
	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

	NodeList nList = doc.getElementsByTagName("staff");

	System.out.println("----------------------------");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);

		System.out.println("\nCurrent Element :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

              
			Element eElement = (Element) nNode;

			System.out.println("Staff id : " + eElement.getAttribute("id"));
                        ps.setString(1, eElement.getAttribute("id"));
			System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                        ps.setString(2, eElement.getElementsByTagName("firstname").item(0).getTextContent());
			System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                        ps.setString(3, eElement.getElementsByTagName("lastname").item(0).getTextContent());
			System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                        ps.setString(4, eElement.getElementsByTagName("nickname").item(0).getTextContent());
			System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                        ps.setString(5, eElement.getElementsByTagName("salary").item(0).getTextContent());
                        
                        
		}
                ps.executeUpdate();
	}
        
        
    } catch (Exception e) {
	e.printStackTrace();
    }
  }

}