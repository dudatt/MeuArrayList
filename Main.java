public class Main {
    public static void main(String[] args) {
        MeuArrayList<Integer> lista = new MeuArrayList<>();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);

        System.out.println(lista.get(0));  
        lista.set(0, 10); 
        System.out.println(lista.get(0));  
        System.out.println(lista.tamanho()); 
        
        lista.remover(1); 
        System.out.println(lista.tamanho()); 
    }
}