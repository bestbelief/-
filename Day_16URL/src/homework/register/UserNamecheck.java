package homework.register;
import homework.Main;
import org.dom4j.Attribute;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;

    public class UserNamecheck {

        public static void check() {

            boolean isMatched;
            isMatched = Pattern.matches("[1][38]([1-9]){9}", Main.userName);
            isMatched = Pattern.matches("[^0]([19]){5,9}[@qq.com]", Main.passWord);

        }

        public boolean userNameExist(String un, String ps) throws DocumentException {
            SAXReader saxReader = new SAXReader();
            org.dom4j.Document document = saxReader.read(new File("src/user.xml"));

            org.dom4j.Element rootElement = document.getRootElement();

            List<org.dom4j.Element> user = rootElement.elements("user");


            for (int i = 0; i < user.size(); i++) {

                Attribute username = user.get(i).attribute("username");
                String usernameValue = username.getValue();

                if (usernameValue.equals(un)) {
                    org.dom4j.Element password = user.get(i).element("password");
                    String text = password.getText();
                    if (text.equals(ps)) {
                        return true;
                    }

                }
            }
             return  false;
    }
}





