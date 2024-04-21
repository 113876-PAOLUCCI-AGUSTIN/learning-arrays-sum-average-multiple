import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* CARGAR UN ARREGLO DE NÚMEROS ENTEROS POR TECLADO.
         EL USUARIO DEBE INDICAR INCIIALMENTE LA CANTIDAD DE NUMEROS A CARGAR.
         CALCULAR Y MOSTRAR:
            - SUMATORIA DE TODOS LOS NUMEROS.
            - PROMEDIO DE TODOS
            - SI SE INGRESÓ ALGÚN MÚLTIPLO DE 5.
        */

        System.out.println("Indique el tamaño del arreglo...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arreglo = new Integer[n];

        // ADDING ELEMENTS.
        System.out.println("Cargue los números uno a uno.");
        for (int i = 0; i < arreglo.length ; i++) {
            arreglo[i] = sc.nextInt();
        }

        // SUM & MULTIPLE
        boolean multiploDe5 = false;
        int sumatoria = 0;
        for (int i = 0; i < arreglo.length ; i++) {
            sumatoria += arreglo[i];
            if(arreglo[i]%5 == 0){
                multiploDe5 = true;
            }
        }

        // AVERAGE
        double promedio = (double) sumatoria / n;

        System.out.println("Sumatoria de todos los elementos: " +sumatoria);
        System.out.println("Promedio de todos los elementos: " +promedio);
        System.out.println("¿Se ingresó algun multiplo de 5? " +multiploDe5);
    }
}