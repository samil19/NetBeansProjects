/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reading_with_sax;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Francisco Samyl Jimenez Dickson 20142920
 * https://www.mkyong.com/java/how-to-read-xml-file-in-java-sax-parser/
 */
public class Reading_with_sax {

    /**
     * @param args the command line arguments
     */
    public void leer(String Path) {
       try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler;
           handler = new DefaultHandler() {
               
               boolean bfname = false;
               boolean blname = false;
               boolean bnname = false;
               boolean bsalary = false;
               PreparedStatement ps = db.DBUtils.getPreparedStatement("insert into dbo.sax values(?, ?, ?, ?)");
               
               
               public void startElement(String uri, String localName,String qName,
                       Attributes attributes) throws SAXException {
                   
                   System.out.println("Start Element :" + qName);
                   
                   if (qName.equalsIgnoreCase("FIRSTNAME")) {
                       bfname = true;
                   }
                   
                   if (qName.equalsIgnoreCase("LASTNAME")) {
                       blname = true;
                   }
                   
                   if (qName.equalsIgnoreCase("NICKNAME")) {
                       bnname = true;
                   }
                   
                   if (qName.equalsIgnoreCase("SALARY")) {
                       bsalary = true;
                   }
                   
               }
               
               public void endElement(String uri, String localName,
                       String qName) throws SAXException {
                   System.out.println("End Element :" + qName);
                   
               }
               
               public void characters(char ch[], int start, int length) throws SAXException {
                   
                   if (bfname) {
                       try {
                       System.out.println("First Name : " + new String(ch, start, length));
                       bfname = false;
                           ps.setString(1, new String(ch, start, length));
                       } catch (SQLException ex) {
                           Logger.getLogger(Reading_with_sax.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
                   
                   if (blname) {
                       try {
                       System.out.println("Last Name : " + new String(ch, start, length));
                       blname = false;
                       
                           ps.setString(2, new String(ch, start, length));
                       } catch (SQLException ex) {
                           Logger.getLogger(Reading_with_sax.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
                   
                   if (bnname) {
                       try {
                       System.out.println("Nick Name : " + new String(ch, start, length));
                       bnname = false;
                           ps.setString(3, new String(ch, start, length));
                       } catch (SQLException ex) {
                           Logger.getLogger(Reading_with_sax.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
                   
                   if (bsalary) {
                       try {
                       System.out.println("Salary : " + new String(ch, start, length));
                       bsalary = false;
                                              
                           ps.setString(4, new String(ch, start, length));
                       } catch (SQLException ex) {
                           Logger.getLogger(Reading_with_sax.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }
                   try {
                       ps.executeUpdate();
                   } catch (SQLException ex) {
                       Logger.getLogger(Reading_with_sax.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
               
           };

       saxParser.parse(Path, handler);

     } catch (Exception e) {
       e.printStackTrace();
     }

   }

    void read(String path) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}