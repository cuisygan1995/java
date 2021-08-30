package usualClass.stringfunc;

import java.util.Locale;

public class stingFunc {
    public static void main(String[] args) {
        String string = "I am Learing java,am  ";
        //length
        System.out.println("-----------length-----------");
        System.out.println(string.length());
        //charAt
        System.out.println("-----------charAt-----------");
        System.out.println(string.charAt(0));
        //contains
        System.out.println("-----------contains-----------");
        System.out.println(string.contains("java"));
        //toCharArray
        System.out.println("-----------toCharArray-----------");
        char[] arry = string.toCharArray();
        System.out.println(arry);
        for (char data : arry) {
            System.out.println(data);
        }
        //indexof,lastIndexOf
        System.out.println("-----------indexof,lastIndexOf-----------");
        System.out.println(string.indexOf("am"));
        System.out.println(string.indexOf("am", 4));
        System.out.println(string.lastIndexOf("am"));
        //trim去空格
        System.out.println("-----------trim-----------");
        System.out.println(string.trim());
        //toUpperCase,toLowerCase
        System.out.println("-----------toUpperCase,toLowerCase-----------");
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        // endsWith,startsWith
        System.out.println("-----------endsWith,startsWith-----------");
        System.out.println(string.endsWith("am"));
        System.out.println(string.endsWith("am  "));
        System.out.println(string.startsWith("I"));
        // replace
        System.out.println("-----------replace-----------");
        System.out.println(string.replace("I", "He"));
        // split
        System.out.println("-----------split-----------");
        System.out.println(string.split(" "));
        String[] array2 = string.split(" ");
        for (String data : array2) {
            System.out.println(data);
        }
    }
}
