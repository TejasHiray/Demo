import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String name="TeJas";
        int value=name.length();
        System.out.println(value);

        String lstring=name.toLowerCase();
        System.out.println(lstring);

        String ustring=name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString="     Tejas    ";
        System.out.println(nonTrimmedString);
        String trimmedString=nonTrimmedString.trim();
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace("s","ss"));
        System.out.println(name.replace("s","Hiray"));
    }
}
