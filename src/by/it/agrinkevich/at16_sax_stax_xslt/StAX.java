package by.it.agrinkevich.at16_sax_stax_xslt;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class StAX {

    private String tab="";
    private StringBuilder text=new StringBuilder();

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        /*XMLInputFactory factory = XMLInputFactory.newInstance();
        String filename = "src/by/it/agrinkevich/at15/sites.xml";
        Reader source=new FileReader(filename);
        XMLStreamReader reader = factory.createXMLStreamReader(source);
        while (reader.hasNext()){
            int type=reader.next();
            switch (type){
                case XMLStreamConstants.START_ELEMENT:
                    StringBuilder at=new StringBuilder();
                    int n = reader.getAttributeCount();
                    for (int i = 0; i < n; i++) {
                        at.append(" ")
                                .append(reader.getLocalName(i))
                                .append("=")
                                .append(reader);
                    }
                    System.out.println(tab+"<"+qName+at+">");
                    tab=tab.concat("\t");
                    System.out.println("start");
                    break;
                case XMLStreamConstants.CHARACTERS:
                    System.out.println("text");
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    System.out.println("end");
                    break;
            }
        }

*/
    }
}