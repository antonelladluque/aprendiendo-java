import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* int numeros [] = new int [9];

        numeros[0]= 15; // guardando el num 15 en la posicion 0
        numeros[1]=12;
        numeros[2]=65;

        System.out.println(numeros[1]);

        for (int i=0; i<=numeros.length; i++){

        }*/


        /*int arreglo [] = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<=arreglo.length; i++){
            System.out.println("Ingrese el valor");
            arreglo [i] =  teclado.nextInt();
            System.out.println(arreglo[i]);
        }


*/


//programa que cargue nombre los nombres Alejandra, Rosa, Guillermo, Luisa. y mostrar por pantalla


  /*      int i;

        String personas[] = new String[4];
        Scanner teclado = new Scanner(System.in);

        for (i = 0; i <personas.length; i++) {
            System.out.println("Ingrese el nombre: ");
            personas[i]= teclado.nextLine();

        }

        for (i=0; i<personas.length; i++){
            System.out.println(personas[i]);
        }
*/

        //cargar 10 numeros, y determinar cual es el mayor
     /*   int i;
        int numeros[] = new int [10];
        Scanner teclado = new Scanner(System.in);
        int max= 0;

        for (i=0; i<numeros.length; i++){
            System.out.println("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
            if ( max<numeros[i]){
                max=numeros[i];
            }
        }
        System.out.println("El numero que mayor valor ingresado es:" + max); */

// cargar 15 numeros en un vector, e informar cuantas veces se cargó el numero 3

  /*      int i;
        Scanner teclado = new Scanner(System.in);
        int quincenumeros [] = new int [15];
        int contador=0;

        for ( i=0 ; i<quincenumeros.length ; i++){
            System.out.println("Ingrese un numero: ");
            quincenumeros[i] = teclado.nextInt();
            if (quincenumeros[i]==3){   //lo podria poner afuera tb
                contador++;
            }
        }
        System.out.println("El numero 3 se repetió "+ contador + "veces"); */

// almacenar 12 sueldos, mostrar la suma total de esos sueldos y el promedio

        int i;
        double sueldo [] = new double [12];
        double promedio, sumatotal;
        Scanner teclado = new Scanner(System.in);

        promedio=0;
        sumatotal=0;

        for (i=0 ; i<sueldo.length ; i++){
            System.out.println("Ingrese su sueldo");
            sueldo[i]= teclado.nextDouble();
            sumatotal=sumatotal+ sueldo[i];
        }

        promedio= sumatotal/12;

        System.out.println("La suma Total es de "+ sumatotal + " pesos");
        System.out.println("el promedio total es de "+ promedio);
    }
}


