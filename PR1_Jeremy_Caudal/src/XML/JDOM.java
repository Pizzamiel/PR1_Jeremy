package XML;

import java.io.*;

import org.jdom2.Attribute;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class JDOM {
	public static void main(String[] args) throws IOException {
			
			
			
	        Element cli = new Element("cli");
	        Document doc = new Document(cli);
	    	DocType docType = new DocType("cli", "cli.dtd");
	    	doc.setDocType(docType);
	        
	        Element argumentK = new Element("argument");
	        argumentK.setAttribute(new Attribute("acces", "-K"));
	        argumentK.setAttribute(new Attribute("nb", "150"));
	        argumentK.setText("Valeur de l'indice");
	        doc.getRootElement().addContent(argumentK);
	        
	        Element argumentA = new Element("argument");
	        argumentA.setAttribute(new Attribute("acces", "-A"));
	        argumentA.setAttribute(new Attribute("nb", "0.85"));
	        argumentA.setText("Valeur d'alpha");
	        doc.getRootElement().addContent(argumentA);
	        
	        Element argumentE = new Element("argument");
	        argumentE.setAttribute(new Attribute("acces", "-E"));
	        argumentE.setAttribute(new Attribute("nb", "-1"));
	        argumentE.setText("Valeur de la precision");
	        doc.getRootElement().addContent(argumentE);
	        
	        Element argumentC = new Element("argument");
	        argumentC.setAttribute(new Attribute("acces", "-C"));
	        argumentC.setText("Mode matrice creuse");
	        doc.getRootElement().addContent(argumentC);
	        
	        Element argumentP = new Element("argument");
	        argumentP.setAttribute(new Attribute("acces", "-P"));
	        argumentP.setText("Mode matrice pleine");
	        doc.getRootElement().addContent(argumentP);
	        
	        XMLOutputter xml = new XMLOutputter();
	        xml.setFormat(Format.getPrettyFormat());
	        xml.output(doc, new FileWriter("D:\\Users\\Jeremy\\eclipse-workspace\\PR1_Jeremy\\src\\XML\\cliEx6.xml"));
	        System.out.println("End.");
	}
}
