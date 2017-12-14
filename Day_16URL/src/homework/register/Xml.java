package homework.register;

import homework.Main;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Xml {

        public  static Element user;
        public static void xml(String userName,String passWord,String name) throws IOException {
            Document document;
            SAXReader  reader = new SAXReader();
            try {
            document = reader.read(new File("src/data.xml"));
            Element element =document.getRootElement();
            Element   user =element.addElement("user");
            Xml.user =user;
            } catch (DocumentException e) {
             document =DocumentHelper.createDocument();
            Element  element = document.addElement("users");
            Element   user =element.addElement("user");
            Xml.user=user;
            }

            user.addAttribute("username",userName);
            Element password = user.addElement("password");
            password.addText(passWord);
            Element Name =user.addElement("name");
            Name.addText(name);

            OutputFormat outputFormat = OutputFormat.createPrettyPrint();
            outputFormat.setEncoding("utf-8");

            XMLWriter  writer = new XMLWriter(new FileWriter("src/data.xml"),outputFormat);
            writer.write(document);
            writer.close();



    }





}
