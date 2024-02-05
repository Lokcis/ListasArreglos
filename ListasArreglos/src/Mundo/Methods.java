package Mundo;

/**
 *
 * @author lokcis
 */
public class Methods {

    /**
     * Añade un elemento al arreglo principal en la posicion indicada por el
     * usuario
     *
     * @param pos Posicion ingresada por el usuario
     * @param ele Elemento ingresado por el usuario
     * @param array
     * @throws Exception
     */
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

    /**
     * Añade un elemento al final de la lista
     *
     * @param ele Elemento que se añade
     * @param array
     * @throws Exception
     */
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

    /**
     * Añade los elementos del arreglo principal al arreglo secundario
     *
     * @param arrayM Arreglo principal
     * @param arrayS Arreglo al cual se le añaden elementos
     */
    public void add(String[] arrayM, String[] arrayS) {
        for (int i = 0; i < Math.min(arrayM.length, arrayS.length); i++) {
            arrayS[i] = arrayM[i];
        }
    }

    /**
     * Elimina el elemento en la ubicacion indicada
     *
     * @param array Arreglo principal
     * @param pos Posicion del elemento que se elimina
     */
    public void remove(String[] array, int pos) {
        array[pos] = null;
        for (int i = pos; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
    }

    /**
     * Elimina el elemento indicado
     *
     * @param array
     * @param ele Elemento que se elimina
     */
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

    /**
     * Elimina los espacios vacios
     *
     * @param array
     * @return
     */
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

    /**
     * Elimina todos los elementos vacios
     *
     * @param array
     */
    public void clear(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i] = null;
            } else {
                break;
            }
        }
    }

    /**
     * Crea y devuelve un nuevo arreglo con las nuevas dimensiones
     * especificadas.
     *
     * @param array Arreglo original del cual se creará el nuevo arreglo.
     * @param newSize Tamaño nuevo del arreglo.
     * @return Un nuevo arreglo con las dimensiones especificadas.
     * @throws IllegalArgumentException Si el tamaño nuevo es menor que cero.
     */
    public String[] resize(String[] array, int newSize) throws IllegalArgumentException {
        if (newSize < 0) {
            throw new IllegalArgumentException("El nuevo tamaño del arreglo no puede ser negativo.");
        }
        String[] newArray = new String[newSize];

        int copyLength = Math.min(array.length, newSize);
        System.arraycopy(array, 0, newArray, 0, copyLength);

        return newArray;
    }

    /**
     * Encuentra la primera ocurrencia de un elemento en el arreglo.
     *
     * @param element Elemento que se desea buscar.
     * @param array Arreglo inicial en el cual se buscará la ocurrencia.
     * @return Un mensaje indicando la posición de la primera ocurrencia o un
     * mensaje de error.
     */
    public String firstOcc(String element, String[] array) {
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

    /**
     * Encuentra la ultima ocurrencia de un elemento en el arreglo.
     *
     * @param element Elemento que se desea buscar.
     * @param array Arreglo inicial en el cual se buscará la ocurrencia.
     * @return Un mensaje indicando la posición de la ultima ocurrencia o un
     * mensaje de error.
     */
    public String lastOcc(String element, String[] array) {
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

    /**
     * Obtiene el elemento en la posición especificada del arreglo.
     *
     * @param array Arreglo inicia en el cual se desea obtener el elemento.
     * @param position Posición del elemento que se desea obtener.
     * @return El elemento en la posición especificada.
     * @throws IllegalArgumentException Si el arreglo es nulo o la posición es
     * inválida.
     */
    public String elementsAndPositions(String[] array, int position) {
        if (array == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        if (position < 0 || position >= array.length) {
            throw new IllegalArgumentException("Posición inválida.");
        }
        return array[position];
    }

    /**
     * Obtiene la cantidad de elementos en el arrelgo
     *
     * @param array Arreglo inicia en el cual se desea saber la cantidad de
     * elementos.
     * @return La cantidad de elementos en el arreglo
     */
    public int elements(String[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Verifica si el arreglo está vacío (todos los elementos son nulos).
     *
     * @param array Arreglo que se desea verificar.
     * @return true si el arreglo está vacío, false si contiene al menos un
     * elemento no nulo.
     */
    public boolean empty(String[] array) {
        if (array[0] == null) {
            return true;
        }
        return false;
    }

    /**
     * Crea y devuelve una sublista del arreglo original, desde la posición de
     * inicio hasta la posición final inclusiva.
     *
     * @param start Índice de inicio de la sublista.
     * @param end Índice final de la sublista.
     * @param array Arreglo original del cual se creará la sublista.
     * @return Una sublista del arreglo original.
     * @throws Exception Si el arreglo está vacío, o los índices de sublista son
     * inválidos.
     */
    public String[] sublist(int start, int end, String[] array) throws Exception {
        boolean allNulls = true;

        for (String str : array) {
            if (str != null) {
                allNulls = false;
                break;
            }
        }
        if (allNulls) {
            throw new Exception("Error: El arreglo está vacío. Agrega elementos al arreglo antes de intentar crear una sublista.");
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

    /**
     * Verifica si un elemento específico existe en el arreglo.
     *
     * @param array Arreglo en el cual se buscará el elemento.
     * @param element Elemento que se desea buscar.
     * @return true si el elemento existe en el arreglo, false de lo contrario.
     * @throws IllegalArgumentException Si el arreglo es nulo.
     */
    public boolean exists(String[] array, String element) {
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
