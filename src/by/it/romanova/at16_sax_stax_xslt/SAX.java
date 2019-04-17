package by.it.romanova.at16_sax_stax_xslt;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX extends DefaultHandler {

    private String tab = "\t";
    private StringBuilder text;

    @Override
    public void startDocument() throws SAXException {
        text = new StringBuilder();
        System.out.println("Start sax");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Stop sax");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        StringBuilder at = new StringBuilder();
        int n = attributes.getLength();
        for (int i = 0; i < n; i++) {
            at.append(" ").append(attributes.getLocalName(i)).append("=").append(attributes.getValue(i));
        }
        System.out.println(tab + "<" + qName + at + ">");
        tab = tab.concat("\t");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        tab = tab.substring(1);
        String out = text.toString().trim();
        if (!out.isEmpty()){
            System.out.println(tab + out);
            text.setLength(0);
        }
        System.out.println(tab + "<" + qName + ">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text.append(ch, start, length);
    }
}
