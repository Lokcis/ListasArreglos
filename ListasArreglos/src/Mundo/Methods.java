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
        for (int i = 0; i < Math.min(arrayM.length, arrayS.length); i++) {
            arrayS[i] = arrayM[i];
        }
    }

    public void remove(String[] array, int pos) {
        array[pos] = null;
        for (int i = pos; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
    }

    public void remove(String[] array, String ele) {
        for (int i = 0; i < array.length; i++) {
            if (ele.equals(array[i])) {
                array[i] = null;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = null;
                break;
            }
        }
    }

    public String[] remove(String[] array) {
        int nullCount = 0;
        for (String s : array) {
            if (s == null) {
                nullCount++;
            }
        }
        String[] newArray = new String[array.length - nullCount];
        int newIndex = 0;

        for (String s : array) {
            if (s != null) {
                newArray[newIndex] = s;
                newIndex++;
            }
        }
        return newArray;
    }

    public void clear(String[] array) throws IllegalArgumentException {
        boolean Nulls = true;
        for (Object obj : array) {
            if (obj != null) {
                Nulls = false;
                break;
            }
        }
        if (Nulls) {
            throw new IllegalArgumentException("El arreglo no puede estar vacio. Agregue elementos antes de. ");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public String[] resize(String[] array, int newSize) throws IllegalArgumentException {
        if (newSize < 0) {
            throw new IllegalArgumentException("El nuevo tamaño del arreglo no puede ser negativo.");
        }
        String[] newArray = new String[newSize];

        int copyLength = Math.min(array.length, newSize);
        System.arraycopy(array, 0, newArray, 0, copyLength);

        return newArray;
    }

    public String FirstOcc(String element, String[] array) {
        if (element == null || array == null) {
            return "Error: Los parámetros no pueden ser nulos.";
        }

        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                return "La primera ocurrencia de '" + element + "' se encuentra en la posición " + i;
            }
        }
        return "No se encontró ninguna ocurrencia de '" + element + "'";
    }

    public String LastOcc(String element, String[] array) {
        if (element == null || array == null) {
            return "Error: Los parámetros no pueden ser nulos.";
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (element.equals(array[i])) {
                return "La última ocurrencia de '" + element + "' se encuentra en la posición " + i;
            }
        }
        return "No se encontró ninguna ocurrencia de '" + element + "'";
    }

    public String ElementsAndPositions(String[] array, int position) {
        if (array == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        if (position < 0 || position >= array.length) {
            throw new IllegalArgumentException("Posición inválida.");
        }
        return array[position];
    }

    public int elements(String[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count++;
            }
        }
        return count;
    }

    public boolean empty(String[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        for (Object obj : array) {
            if (obj != null) {
                return false;
            }
        }
        return true;
    }

    public String[] Sublist(int start, int end, String[] array) throws Exception {
        boolean allNulls = true;
        for (Object obj : array) {
            if (obj != null) {
                allNulls = false;
                break;
            }
        }
        if (allNulls) {
            throw new Exception("Error: El arreglo esta vacio. Agrega elementos al arreglo antes de intentar crear una sublista.");
        }
        if (start < 0 || end >= array.length || start > end) {
            throw new Exception("Error: Índices de sublista inválidos.");
        }
        int sublistSize = end - start + 1;
        String[] sublist = new String[sublistSize];

        for (int i = 0; i < sublistSize; i++) {
            sublist[i] = array[start + i];
        }
        return sublist;
    }

    public boolean Exists (String[] array, String element) {
        if (array == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        for (String s : array) {
            if (s != null && s.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
