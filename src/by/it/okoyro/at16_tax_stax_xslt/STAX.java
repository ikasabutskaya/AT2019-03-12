package by.it.okoyro.at16_tax_stax_xslt;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class STAX {

	private static String tab = "";
	private static StringBuilder text = new StringBuilder();

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		XMLInputFactory factory = XMLInputFactory.newInstance();
		String filename = "/Users/oksanakoyro/work/AT2019-03-12/src/by/it/okoyro/at15/sites.xml";
		Reader reader = new FileReader(filename);
		XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(reader);
		while (xmlStreamReader.hasNext()) {
			int type = xmlStreamReader.next();
			switch (type) {
				case XMLStreamConstants.START_ELEMENT:
					System.out.println("start");
					break;
				case XMLStreamConstants.CHARACTERS:
					System.out.println("text");
					break;
				case XMLStreamConstants.END_ELEMENT:
					System.out.println("end");
					break;
				default:
			}
		}
	}
}
