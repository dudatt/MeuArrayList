public class MeuArrayList<T> {
    private Object[] array;
    private int tamanho;

    public MeuArrayList() {
        array = new Object[10];
        tamanho = 0;
    }

    public void adicionar(T elemento) {
        if (tamanho == array.length) {
            aumentarCapacidade();
        }
        array[tamanho] = elemento;
        tamanho++;
    }

    public T get(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        return (T) array[index];
    }

    public void set(int index, T elemento) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        array[index] = elemento;
    }

    public int tamanho() {
        return tamanho;
    }

    public void remover(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        for (int i = index; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        array[tamanho - 1] = null;
        tamanho--;
    }

    private void aumentarCapacidade() {
        Object[] novoArray = new Object[array.length * 2]; 
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = array[i];  
        }
        array = novoArray; 
    }
}
