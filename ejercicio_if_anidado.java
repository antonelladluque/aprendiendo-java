import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
/* varios clientes:
el programa debe solicitar por teclado dos datos:
    la patente del vehiculo
    el tipo de estacionamiento

 */
/*      LOGICA DE LA SOLUCION DEL PROGRAMA
        1) pedir patente

        2) tipo de estaccionamiento
            a) por hora 3usdxhora
            b) media jornada de 15usd con 5% descuento
            c) jornada completa 30usd con 10% descuento

        3) monto a total por cada cliente por tipo de estacionamiento

        4) mostrar
                a) total estacionamiento x hora
                b) total estacionamiento media jornada
                c) total estacionamiento completo
                d) sumatotal del dia
 */
        //declaracion de variables
        String patente;
        int tipoEstacionamiento;
        double montoAPagar, sumatotal, horas;
        int cantCliente1, cantCliente2, cantCliente3;
        boolean respuesta = true;
        Scanner teclado = new Scanner(System.in);


        //inicializar variables
        montoAPagar=0;
        sumatotal=0;
        cantCliente3=0;
        cantCliente1=0;
        cantCliente2=0;

        //proceso

        System.out.println("Ingrese la pantente del vehiculo");
        patente = teclado.nextLine();



        while(!patente.equalsIgnoreCase("fin")){
            System.out.println("Ingrese tipo de estacionamiento");
            tipoEstacionamiento= teclado.nextInt();


            if (tipoEstacionamiento==1){
                System.out.println("ingrese la cantidad de horas");
                horas= teclado.nextDouble();

                montoAPagar=(3*horas);
                cantCliente1=cantCliente1+1;

            }
            else {
                if (tipoEstacionamiento==2){
                    System.out.println("La media jornada es de 15usd");

                    montoAPagar=(15 - (15*0.05));
                    cantCliente2=cantCliente2+1;

                }
                else {
                    if (tipoEstacionamiento==3){
                        System.out.println("La jornada completa es de 30usd");

                        montoAPagar=(30 - (30*0.1));
                        cantCliente3=cantCliente3+1;

                    }

                }
            }
            sumatotal=montoAPagar+ sumatotal;
            System.out.println("El monto a pagar es: "+ montoAPagar + "pesos");

            teclado.nextLine(); //limpiar el buffer


            System.out.println("Ingrese la pantente del vehiculo");
            patente = teclado.nextLine();


        }

        System.out.println("El total de estacionamiento por hora fue de: "+ cantCliente1);
        System.out.println("El total de estacionmiento media jornada fue de: "+ cantCliente2);
        System.out.println("La cantidad de estacionamiento jornada completa fue de "+ cantCliente3);
        System.out.println("La recaudacion total fue de "+ sumatotal+ "pesos");
    }
}
