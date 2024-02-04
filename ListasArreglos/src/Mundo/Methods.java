package Mundo;

/**
 *
 * @author lokcis
 */
public class Methods {

    public void add(int pos, String ele, String[] array) throws Exception {

        if (pos >= 0 && pos < array.length) {

            if (array[pos] != null) {

                array[pos] = ele;

            } else {

                for (int i = 0; i < array.length; i++) {

                    if (array[i] == null) {

                        array[i] = ele;

                        break;

                    }

                }
            }
        } else {
            throw new Exception("La posición ingresada es inválida. Por favor, ingresa una posición entre 0 y " + (array.length - 1));
        }

    }

    public void add(String ele, String[] array) throws Exception {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == null) {

                array[i] = ele;

                break;

            }

            // Si se recorre todo el arreglo y no se encuentra una posición disponible, se lanza una excepción
            if (i == array.length - 1) {
                throw new Exception("El arreglo está lleno. No se puede agregar un elemento.");
            }

        }

    }

}
