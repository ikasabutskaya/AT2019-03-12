package by.it.romanova.at16_sax_stax_xslt;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class STAX {
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        Reader ioreader = new FileReader("src/by/it/romanova/at15/sites.xml");
        XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(ioreader);

    }
}
