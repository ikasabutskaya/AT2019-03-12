package by.it.vshchur.at16_sax_stax_xslt;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAX extends DefaultHandler {
    private String tab = "";
    public StringBuilder text = new StringBuilder();

    @Override
    public void startDocument() throws SAXException {
        System.out.println("START SAX");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("END SAX");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        StringBuilder at = new StringBuilder();
        int n = attributes.getLength();
        for (int i = 0; i < n; i++) {
            at.append(" ").append(attributes.getLocalName(i)).append(" ");

        }
        System.out.println(tab+"<"+qName+">");
        tab=tab.concat("\t");
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        tab=tab.substring(1);
        String out=text.toString().trim();
        System.out.println(tab+"<"+qName+">");    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        text.append(ch, start, length);
    }
}
