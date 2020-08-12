package util;

import java.util.Scanner;

public class AmazonUtil {
    public AmazonUtil() {
    }

    public static int validateUserResponseMenu(int min, int max) {
        Scanner sc = new Scanner(System.in);

        while(!sc.hasNextInt()) {
            sc.next();
            System.out.println("No ingresaste una opción válida1");
            System.out.println("Intenta otra vez1");
        }

        int response;
        for(response = sc.nextInt(); response < min || response > max; response = sc.nextInt()) {
            System.out.println("No ingresaste una opción válida");
            System.out.println("Intenta otra vez");

            while(!sc.hasNextInt()) {
                sc.next();
                System.out.println("No ingresaste una opción válida");
                System.out.println("Intenta otra vez");
            }
        }

        System.out.println("Tu Respuesta fue: " + response + "\n");
        return response;
    }

}
