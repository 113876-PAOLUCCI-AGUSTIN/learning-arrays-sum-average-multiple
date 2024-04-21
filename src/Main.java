/* CARGAR UN ARREGLO DE NÚMEROS ENTEROS POR TECLADO.
 * EL USUARIO DEBE INDICAR INICIALMENTE LA CANTIDAD DE NUMEROS A CARGAR.
 * CALCULAR Y MOSTRAR:
 *     - SUMATORIA DE TODOS LOS NUMEROS.
 *     - PROMEDIO DE TODOS.
 *     - SI SE INGRESÓ ALGÚN MÚLTIPLO DE 5.
 *     - ORDENAR LOS ELEMENTOS DEL ARREGLO.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Indique el tamaño del arreglo...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] myArr = new Integer[n];

        // ADDING ELEMENTS.
        System.out.println("Cargue los números uno a uno.");
        for (int i = 0; i < myArr.length ; i++) {
            myArr[i] = sc.nextInt();
        }

        // SUM & MULTIPLE
        int sumatoria = 0;
        double promedio = 0;
        boolean isMultiDe5 = false;

        for (int i = 0; i < myArr.length ; i++) {
            sumatoria += myArr[i];
            promedio = (double) sumatoria / myArr.length;
            if(myArr[i]%5 == 0){
                isMultiDe5 = true;
            }
        }

        // SUM - AVERAGE - MULTIPLE
        System.out.println("Sumatoria de todos los elementos: " +sumatoria);
        System.out.println("Promedio de todos los elementos: " +promedio);
        System.out.println("¿Se ingresó algun multiplo de 5? " + isMultiDe5);

        // SORT
        System.out.print("Los elementos ordenados son: ");
        Arrays.sort(myArr);
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}