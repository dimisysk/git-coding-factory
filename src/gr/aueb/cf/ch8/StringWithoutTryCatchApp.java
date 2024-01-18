package gr.aueb.cf.ch8;

public class StringWithoutTryCatchApp {
    public static void main(String[] args) {
        String[] tokens = {"LightBlue","Yellow","Red"};
        String s;
        String str = "Blue";

        s = getStringOrNull(tokens,str);
        System.out.printf("%s",(s == null) ? "Substring not found" : s );
    }

    public static String getStringOrNull(String[] strArray,String str) {
        String stringToReturn = null;

        if (strArray == null || str == null) return  null;

        for (String s : strArray) {
            if (s.contains(str)) {
                stringToReturn = s;
            }
        }return stringToReturn;
    }
}
