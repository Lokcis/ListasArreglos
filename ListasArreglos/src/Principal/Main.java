package Principal;

import java.util.Scanner;

/**
 *
 * @author lokcis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opc;
        String[] array;

        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido!\n"
                + "\n"
                + "Que deseas hacer?\n"
                + "\n"
                + "1. Crear un arreglo."
                + "2. Operar un arreglo.");

        opc = in.nextInt();
        switch (opc) {

            case 1:

            case 2:

            default:

        }

        System.out.println("\nIngresa la accion que deseas realizar:\n"
                + "\n"
                + "1. Agregar.\n"
                + "2. Agregar en una posicion especifica.\n"
                + "3. Agregar todos los elementos a otro arreglo.\n"
                + "4. Elimina el elemento en la posicion indicada.\n"
                + "5. Elimina el primer elemento indicado.\n"
                + "6. Eliminar espacios vacios.\n"
                + "7. Eliminar todos los elementos del arreglo.\n"
                + "8. Modifica el tamanio del arreglo.\n"
                + "9. Reemplaza el elemento de la posicion indicada con otro ingresado.\n"
                + "10. Retornar la primera ubicacion del elemento.\n"
                + "11. Retorna el numero de elementos.\n"
                + "12. Retorna la ultima ubicacion del elemento.\n"
                + "13. Retorna los elementos entre los valores indicados.\n"
                + "14. Verificar el elemento en la posicion indicada.\n"
                + "15. Verificar si el arreglo esta vacio.\n"
                + "16. Verificar si el elemento se encuentra en el arreglo.\n");

        opc = in.nextInt();

        switch (opc) {

            case 1 -> {
                System.out.println("si sirve care pija?");
            }

        }
    }
}
