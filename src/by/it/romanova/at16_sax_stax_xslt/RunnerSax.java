package by.it.romanova.at16_sax_stax_xslt;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class RunnerSax {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        String fileName = "src/by/it/romanova/at15/sites.xml";
        SAX handler = new SAX();
        saxParser.parse(fileName, handler);


    }

}
