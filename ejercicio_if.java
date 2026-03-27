import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner edades = new Scanner(System.in);
        int edad;


        System.out.printf("Ingrese su edad");
        edad= edades.nextInt();

        if (edad >= 18) {
            System.out.printf("Felicidades so mayor de edad");
        }
        else{
            System.out.printf("Sos menor de edaad");
        }

    }
}
