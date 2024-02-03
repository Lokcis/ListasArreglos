package Principal;

import Mundo.*;
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

        Methods methods = new Methods();

        int opc, fin = 0, tam, pos;
        boolean validPosition = false;

        String data;
        String[] mainArray, arrayOfArrays;

        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido!\n");

        System.out.println("Ingresa el tamaño del primer arreglo: ");

        tam = in.nextInt();

        mainArray = new String[tam];

        do {
            System.out.println("""  
                           
                           Ingresa la accion que deseas realizar:
                           
                           1. Agregar un elemento en una posicion especifica.
                           2. Agregar un elemento a la lista.
                           3. Agregar todos los elementos a otro arreglo.
                           4. Elimina el elemento en la posicion indicada.
                           5. Elimina el primer elemento indicado.
                           6. Eliminar espacios vacios.
                           7. Eliminar todos los elementos del arreglo.
                           8. Modifica el tamanio del arreglo.
                           9. Reemplaza el elemento de la posicion indicada con otro ingresado.
                           10. Retornar la primera ubicacion del elemento.
                           11. Retorna el numero de elementos.
                           12. Retorna la ultima ubicacion del elemento.
                           13. Retorna los elementos entre los valores indicados.
                           14. Verificar el elemento en la posicion indicada.
                           15. Verificar si el arreglo esta vacio.
                           16. Verificar si el elemento se encuentra en el arreglo.
                            
                           17. Salir.
                           
                           """);

            opc = in.nextInt();

            switch (opc) {

                case 1 -> {

                    System.out.println("Ingrese el elemento: ");

                    data = in.next();

                    do {
                        System.out.println("Ingrese la posicion: ");

                        pos = in.nextInt();

                        try {
                            methods.add(pos, data, mainArray);
                            validPosition = true;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!validPosition);

                    System.out.println("El arreglo es el siguiente: ");

                    for (int i = 0; i < mainArray.length; i++) {
                        System.out.println(mainArray[i]);
                    }

                }

                case 2 -> {

                }

                case 17 -> {

                    fin = 1;

                }

                default -> {

                    System.out.println("Opción incorrecta.");

                }
            }

        } while (fin == 0);

    }
}
