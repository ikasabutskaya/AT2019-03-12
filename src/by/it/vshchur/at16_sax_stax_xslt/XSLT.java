package by.it.vshchur.at16_sax_stax_xslt;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import java.io.FileReader;

public class XSLT {
    public static void main(String[] args) {
        String filename = "src/by/vshchur/at16_sax_stax_xslt/sites.xml"
        TransformerFactory factory = TransformerFactory.newInstance();
        StreamSource xml=new StreamSource(new FileReader(filename));
        Transfor
        factory.newTransformer();
    }
}
