package Mundo;

/**
 *
 * @author lokcis
 */
public class Methods {

    public void add(int pos, String ele, String[] array) throws Exception {

        if (pos >= 0 && pos < array.length) {

            if (array[pos] != null) {
                for (int i = array.length - 1; i > pos; i--) {
                    array[i] = array[i - 1];
                }
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
            if (i == array.length - 1) {
                throw new Exception("El arreglo está lleno. No se puede agregar un elemento.");
            }

        }

    }

    public void add(String[] arrayM, String[] arrayS) {
        // Copia los elementos del arreglo original al nuevo arreglo
        for (int i = 0; i < Math.min(arrayM.length, arrayS.length); i++) {
            arrayS[i] = arrayM[i];
        }
        System.out.println("Se han transferido los elementos al nuevo arreglo.");
    }

}
