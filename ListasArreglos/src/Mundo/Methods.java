package Mundo;

/**
 *
 * @author lokcis
 */
public class Methods {

    public void add(int pos, String ele, String[] array) throws Exception {

        if (pos >= 0 && pos < array.length) {

            for (int i = 0; i < array.length; i++) {

                if (array[i] == null) {

                    array[i] = ele;
                    
                    break;
        
                }

            }
        } else {
            throw new Exception("La posición ingresada es inválida. Por favor, ingresa una posición entre 0 y " + (array.length - 1));
        }

    }

}
