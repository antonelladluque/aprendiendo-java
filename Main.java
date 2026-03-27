import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, suma;

        System.out.println("Ingrese el primer numero");
        num1= teclado.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2= teclado.nextInt();

        suma = num1 + num2;

        System.out.printf("El resultado es " + suma);
    }
}