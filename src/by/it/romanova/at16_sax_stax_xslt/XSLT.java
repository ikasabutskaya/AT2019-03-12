package by.it.romanova.at16_sax_stax_xslt;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class XSLT {
    public static void main(String[] args) throws TransformerException, IOException {
        String xmlPath = "src/by/it/romanova/at15/sites.xml";
        String xslPath = "src/by/it/romanova/at16_sax_stax_xslt/rules.xsl";
        TransformerFactory factory = TransformerFactory.newInstance();
        String html = "src/by/it/romanova/at16_sax_stax_xslt/result.html";
        StreamSource xml = new StreamSource(new FileReader(xslPath));
        Transformer transformer = factory.newTransformer(xml);
        transformer.transform(
                new StreamSource(new FileReader(xmlPath)),
                new StreamResult(new FileWriter(html))
        );
    }
}

