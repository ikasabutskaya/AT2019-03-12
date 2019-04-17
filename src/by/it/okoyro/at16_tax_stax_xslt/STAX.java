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
			int nodeType = xmlStreamReader.next();
			switch (nodeType) {
				case XMLStreamConstants.START_ELEMENT:

					StringBuilder at = new StringBuilder();
					int length = xmlStreamReader.getAttributeCount();
					for (int i = 0; i < length; i++) {
						at.append(" ").append(xmlStreamReader.getAttributeLocalName(i))
								.append("=").append(xmlStreamReader.getAttributeValue(i));
					}
					System.out.println(tab + "<" + xmlStreamReader.getLocalName() + at + ">");
					tab = tab.concat("\t"); // добавить табулятор

					break;
				case XMLStreamConstants.CHARACTERS:

					text.append(xmlStreamReader.getText());

					break;
				case XMLStreamConstants.END_ELEMENT:
					tab = tab.substring(1);  // удалить табулятор
					String out = text.toString().trim();
					if (!out.isEmpty()) {
						System.out.println(tab + out);
						text.setLength(0); // чистим StringBuilder
					}
					System.out.println(tab + "</" + xmlStreamReader.getLocalName() + ">");
					break;
				default:
			}
		}
	}
}
