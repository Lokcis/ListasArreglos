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

        int opc, size, pos, count = 0;
        boolean validPosition, fin = false;
        String data, ele;
        String[] mainArray, secondArray;

        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido!\n");

        System.out.println("Ingresa el tamanio del primer arreglo: ");

        size = in.nextInt();

        mainArray = new String[size];

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
                    count++;

                    do {
                        validPosition = false;
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

                    System.out.println("Ingrese el elemento: ");

                    data = in.next();

                    try {
                        methods.add(data, mainArray);
                        System.out.println("El arreglo es el siguiente: ");
                        for (int i = 0; i < mainArray.length; i++) {
                            System.out.println(mainArray[i]);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                }

                case 3 -> {
                    System.out.println("Ingrese el tamanio del nuevo arreglo: ");
                    size = in.nextInt();
                    secondArray = new String[size];
                    methods.add(mainArray, secondArray);
                    System.out.println("El nuevo arreglo es el siguiente: ");
                    for (String element : secondArray) {
                        System.out.println(element);
                    }
                }

                case 4 -> {
                    System.out.println("Escoge la posicion que deseas eliminar: ");
                    pos = in.nextInt();
                    methods.remove(mainArray, pos);
                    for (int i = 0; i < mainArray.length; i++) {
                        System.out.println(mainArray[i]);
                    }
                }
                
                case 5 ->{
                    System.out.println("Ingresa el elemento a eliminar.");
                    ele = in.next();
                    methods.remove(mainArray, ele);
                    for (int i = 0; i < mainArray.length; i++) {
                        System.out.println(mainArray[i]);
                    }
                }
                
                case 6 ->{
                    
                    
                    
                }

                case 17 -> {

                    fin = true;

                }

                default -> {

                    System.out.println("Opción incorrecta.");

                }
            }

        } while (fin == false);

    }
}
