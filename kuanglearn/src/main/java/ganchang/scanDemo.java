package ganchang;

import java.util.Scanner;

public class scanDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("start!!! please input:");
        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("input data is : " + str);
        }
//        if (scanner.hasNextLine()) {
//            String str = scanner.nextLine();
//            System.out.println("input data is : " + str);
//        }
        scanner.close();
    }
}
