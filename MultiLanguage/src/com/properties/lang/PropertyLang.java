
/*
 Whatsapp: 1-809-978-5552
 Kakaotalk: JoanVasquez
 Email: yoloprogramo22@gmail.com
 */
package com.properties.lang;

import java.util.Properties;

public class PropertyLang extends Properties {

    public PropertyLang(String lang) {
        switch (lang) {
            case "en":
                getProperties("file_en.properties");
                break;

            case "es":
                getProperties("file_es.properties");
                break;

            default:
                getProperties("file.properties");
                break;
        }

    }

    private void getProperties(String property) {
        try {
            load(getClass().getResourceAsStream(property));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
