package by.it.romanova.at16_sax_stax_xslt;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class STAX {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        String fileName = "src/by/it/romanova/at15/sites.xml";

        Reader fr = new FileReader(fileName);
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(fr);

        String tab = "";

        while (xmlStreamReader.hasNext()){
            int type = xmlStreamReader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                {
                    StringBuilder a = new StringBuilder("<");
                    a.append(xmlStreamReader.getLocalName());

                    for (int i = 0; i < xmlStreamReader.getAttributeCount(); i++) {
                        a.append(" ").append(xmlStreamReader.getAttributeName(i)).append("=").append(xmlStreamReader.getAttributeValue(i));
                    }
                    a.append(">");
                    System.out.println(tab + a);
                    tab = tab.concat("\t");
                    break;
                }
                case XMLStreamConstants.CHARACTERS:
                    System.out.println(tab + xmlStreamReader.getText().trim());
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    tab = tab.substring(1);
                    System.out.println(tab + "</" + xmlStreamReader.getLocalName().trim() + ">");
                    break;
                default:
                    xmlStreamReader.close();
                    break;
            }
        }



    }
}
