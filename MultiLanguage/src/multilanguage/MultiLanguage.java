/*
 Whatsapp: 1-809-978-5552
 Kakaotalk: JoanVasquez
 Email: yoloprogramo22@gmail.com
 */
package multilanguage;

import com.properties.lang.PropertyLang;


public class MultiLanguage {

    public static void main(String[] args) {
        System.out.println("\n");
        PropertyLang propertyLangEn = new PropertyLang("en"); //English one
        System.out.println(propertyLangEn.getProperty("printing"));
        System.out.println(propertyLangEn.getProperty("helloWorld"));
        System.out.println("\n");
        PropertyLang propertyLangEs = new PropertyLang("es"); //Spanish
        System.out.println(propertyLangEs.getProperty("printing")); //Pring getting the string with the key
        System.out.println(propertyLangEs.getProperty("helloWorld"));
        System.out.println("\n");
        PropertyLang propertyLangDefault = new PropertyLang("");
        System.out.println(propertyLangDefault.getProperty("printing")); //Default
        System.out.println(propertyLangDefault.getProperty("helloWorld"));
    }
    
}
