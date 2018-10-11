import org.w3c.dom.*;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.rmi.server.ExportException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */

public class writeXML {
    
    
    public boolean writeXML2(int kayitNo,String name,String surname,String bAdi,String age2,String password2,String url){
        
        
        try {
                
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("company");
		doc.appendChild(rootElement);

		
		Element staff = doc.createElement("Staff");
		rootElement.appendChild(staff);
                
		
		Attr attr = doc.createAttribute("id");
		attr.setValue("1");
		staff.setAttributeNode(attr);

		

		
		Element firstname = doc.createElement("name");
		firstname.appendChild(doc.createTextNode(name));
		staff.appendChild(firstname);

		
		Element lastname = doc.createElement("surname");
		lastname.appendChild(doc.createTextNode(surname));
		staff.appendChild(lastname);

                Element password = doc.createElement("password");
		password.appendChild(doc.createTextNode(password2));
		staff.appendChild(password);

                
		
		Element age = doc.createElement("age");
		age.appendChild(doc.createTextNode(age2));
		staff.appendChild(age);

                
		
		Element bolum = doc.createElement("bolum");
                bolum.appendChild(doc.createTextNode(bAdi));
		staff.appendChild(bolum);
                
                Element url2 = doc.createElement("url");
                url2.appendChild(doc.createTextNode(url));
                staff.appendChild(url2);

		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("C:/Users/mehme/OneDrive/Belgeler/NetBeansProjects/WebApplication4/web/WEB-INF/xmlFileExample01.xml"));


		transformer.transform(source, result);

		//System.out.println("File saved!");
                return true;
                
	  } catch (Exception e) {
		          System.err.println("hata oluştu: "+e);
                          return false;
	  }
        
        
        
        
    }
    

    }
     
   
    



   
   
   
    
    
    

