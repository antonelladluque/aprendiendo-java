//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* public class Main {
    public static void main(String[] args) {

        //mostrar por pantalla los n 1 al 35

        int entero;

        for (entero=1; entero<36; entero++){
            System.out.println(entero);
        }

}
} */


/* import java.util.Scanner;

//por teclado ingresar un numero que muestre enpantalla desde el 1 hasta ese numero
public class Main {
    public static void main(String[] args) {

        int entero, i;
        i=1;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero mayor a 0");
        entero = teclado.nextInt();

        for(i=1; i<=entero; i++) {
            System.out.println(i);
        }

    }
} */

//mostrar numero del 200 al 250 de dos en dos

/* public class Main {
    public static void main(String[] args) {
        int num = 200;

        for (num =200; num<=250; num+=2 ){
            System.out.println(num);
        }

    }
} */

//ingresar palabras hasta la palbra salir

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palabra;
        boolean respuesta;
        Scanner teclado = new Scanner(System.in);

        respuesta = false;

        System.out.println("escriba una palabra");
        palabra = teclado.next();


        if (palabra.equals("salir")) {
            respuesta = true;
        }
        else {

            while (respuesta==false){
                System.out.println(palabra);

                System.out.println("ingrese otra palabra");
                palabra = teclado.next();

                if (palabra.equals("salir")) {
                    respuesta=true;

                }
            }
        }


    }
}
