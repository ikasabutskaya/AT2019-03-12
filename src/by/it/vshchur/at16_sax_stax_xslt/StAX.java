package by.it.vshchur.at16_sax_stax_xslt;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class StAX {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        String filename = "src/by/vshchur/at16_sax_stax_xslt/sites.xml"
        Reader reader = new FileReader(filename);
        XMLStreamReader xmlStreamReader = factory.createXMLStreamReader();
        while (xmlStreamReader.hasNext()) {
            int type = xmlStreamReader.next();
            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    StringBuilder at = new StringBuilder();
                    int n = xmlStreamReader.getAttributeCount();
                    for (int i = 0; i < n; i++)
                        at
                                .append(" ")
                                .append(xmlStreamReader.getAttributeLocalName(i))
                                .append("=")
                                .append(xmlStreamReader.getAttributeValue(i));
            }
        }


    }
}
