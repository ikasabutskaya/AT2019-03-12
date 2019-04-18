package by.it.agrinkevich.at15;

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
        String language  = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "src/by/it/agrinkevich/at15/sites+xsd.xml";
        String schemaName = "src/by/it/agrinkevich/at15/sites.xsd";
        SchemaFactory factory = SchemaFactory.newInstance(language);
        File schemaLocation = new File(schemaName);
        try {
            Schema schema = factory.newSchema(schemaLocation);
            Validator validator = schema.newValidator();
            Source source = new StreamSource(fileName);
            validator.validate(source);
            System.out.println(fileName + " валиден");
        }catch (SAXException e){
            System.err.print(fileName + " не валиден" +
                    e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
