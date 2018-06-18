package utils;

public class OutUtils {

    public static void show(String... ss) {
        for (String s : ss) {
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
