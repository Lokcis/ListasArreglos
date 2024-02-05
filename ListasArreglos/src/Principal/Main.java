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
        String data, ele, state;
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
                           9. Retornar la primera ubicacion del elemento.
                           10. Retorna el numero de elementos.
                           11. Retorna la ultima ubicacion del elemento.
                           12. Retorna los elementos entre los valores indicados.
                           13. Retornar el elemento de la posicon indicada.    
                           14. Verificar el elemento en la posicion indicada.
                           15. Verificar si el arreglo esta vacio.
                           16. Verificar si el elemento se encuentra en el arreglo.                          
                           17. Salir.
                           
                           """);

            opc = in.nextInt();

            switch (opc) {

                //Agregar un elemento en una posicion especifica.
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
                //Agregar un elemento a la lista.
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
                //Agregar todos los elementos a otro arreglo.
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
                //Elimina el elemento en la posicion indicada.
                case 4 -> {
                    System.out.println("Escoge la posicion que deseas eliminar: ");
                    pos = in.nextInt();
                    methods.remove(mainArray, pos);
                    for (int i = 0; i < mainArray.length; i++) {
                        System.out.println(mainArray[i]);
                    }
                }
                //Elimina el primer elemento indicado.
                case 5 -> {
                    System.out.println("Ingresa el elemento a eliminar.");
                    ele = in.next();
                    methods.remove(mainArray, ele);
                    for (int i = 0; i < mainArray.length; i++) {
                        System.out.println(mainArray[i]);
                    }
                }
                //Eliminar espacios vacios.
                case 6 -> {
                    mainArray = methods.remove(mainArray);
                    System.out.println("El nuevo arreglo es: ");
                    for (int i = 0; i < mainArray.length; i++) {
                        System.out.println(mainArray[i]);
                    }
                }
                //Eliminar todos los elementos del arreglo.
                case 7 -> {
                    try {
                        methods.clear(mainArray);
                        for (int i = 0; i < mainArray.length; i++) {
                            System.out.println(mainArray[i]);
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                //Modifica el tamanio del arreglo.
                case 8 -> {
                    System.out.println("Ingrese el nuevo tamaño del arreglo: ");
                    int newSize = in.nextInt();

                    try {
                        mainArray = methods.resize(mainArray, newSize);
                        System.out.println("Arreglo redimensionado:");
                        for (int i = 0; i < mainArray.length; i++) {
                            System.out.println(mainArray[i]);
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                //Retornar la primera ubicacion del elemento.
                case 9 -> {
                    try {
                        System.out.println("Ingrese el elemento para encontrar la primera ocurrencia: ");
                        String elementToFind = in.next();

                        System.out.println(methods.firstOcc(elementToFind, mainArray));
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                //Retorna el numero de elementos.
                case 10 -> {
                    int elementCount = methods.elements(mainArray);
                    System.out.println("Número de elementos en el arreglo: " + elementCount);
                }
                //Retorna la ultima ubicacion del elemento.
                case 11 -> {
                    try {
                        System.out.println("Ingrese el elemento para encontrar la última ocurrencia: ");
                        String elementToFind = in.next();

                        System.out.println(methods.lastOcc(elementToFind, mainArray));
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                //Retorna los elementos entre los valores indicados.
                case 12 -> {
                    try {
                        System.out.println("Ingrese la posición de inicio para la sublista: ");
                        int start = in.nextInt();

                        System.out.println("Ingrese la posición de fin para la sublista: ");
                        int end = in.nextInt();

                        String[] sublist = methods.sublist(start, end, mainArray);

                        System.out.print("Sublista creada: [");
                        for (int i = 0; i < sublist.length; i++) {
                            System.out.print(sublist[i]);
                            if (i < sublist.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                    } catch (Exception e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                //Retornar el elemento de la posicon indicada.  
                case 13 -> {
                    try {
                        System.out.println("Por favor, ingresa la posición del elemento que quieres ver:");
                        pos = in.nextInt();
                        String element = methods.elementsAndPositions(mainArray, pos);
                        System.out.println("Posición: " + pos + ", Elemento: " + element);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                case 14 -> {
                    System.out.println("Ingresa la posicion y el elemento: ");
                    System.out.println("Posicion: ");
                    pos = in.nextInt();
                    System.out.println("Elemento: ");
                    ele = in.next();
                    state = methods.exist(mainArray, ele, pos);
                    if (state == "Existe") {
                        System.out.println("El elemento existe.");
                    }else{
                        System.out.println("No existe el elemento.");
                    }
                }
                //Verificar si el arreglo esta vacio.
                case 15 -> {
                    boolean isEmpty = methods.empty(mainArray);

                    if (isEmpty) {
                        System.out.println("El arreglo esta vacio.");
                    } else {
                        System.out.println("El arreglo no esta vacio.");
                    }
                }
                //Verificar si el elemento se encuentra en el arreglo.  
                case 16 -> {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Por favor, ingresa el elemento que quieres buscar:");
                        String element = scanner.nextLine();
                        boolean contains = methods.exists(mainArray, element);
                        if (contains) {
                            System.out.println("El elemento '" + element + "' está en el arreglo.");
                        } else {
                            System.out.println("El elemento '" + element + "' no está en el arreglo.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
                //Salir
                case 17 -> {

                    fin = true;
                }
                default -> {

                    System.out.println("Opción incorrecta.");

                }
            }

        } while (fin
                == false);

    }
}
