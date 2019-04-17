package by.it.romanova.at15;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidXSD {
    public static void main(String[] args) {
        String langage = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String file = "/Users/elizabeth/AT2019-03-12/src/by/it/romanova/at15/sites+xsd.xml";
        String schemaPath = "/Users/elizabeth/AT2019-03-12/src/by/it/romanova/at15/xsd_sites.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(langage);
        File schemaLocation = new File(schemaPath);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(file);
            validator.validate(source);
            System.out.println(file + " валиден");
        }
        catch (SAXException e) {
            System.out.println("Валидация " + file + " не выполнена:\n");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(file + " не валиден\n");
            e.printStackTrace();
        }
    }
}
