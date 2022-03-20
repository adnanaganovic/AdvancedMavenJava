package TwoAdvanced.i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class i18nDemo {
    public static void main(String[] args) {
        System.out.println("Unesi lokalizaciju jezika UPERCASE: ");
        String language =  new Scanner(System.in).nextLine();
        System.out.println("Unesi lokalizaciju zemlje lowecase: ");
        String country = new Scanner(System.in).nextLine();

        Locale locale = new Locale(language, country);
        //imefajla_langCode_countryCode.properties
        //Može se još koristiti i: .arb Dart Flutter
        //values
              //strings.xml
        //values_de_DE
             //strings.xml

        ResourceBundle translatedMessages = ResourceBundle.getBundle("Messages", locale);

        System.out.println(translatedMessages.getString("greetings"));
        System.out.println(translatedMessages.getString("inqury"));
        System.out.println(translatedMessages.getString("farewell"));
    }
}
