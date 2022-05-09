package pilha;

public interface InterfacePilha <T> {
        // interface para pilha => metodos que vao ser usados
        void colocarNoTopo(T number) throws Exception;   // colocar no topo generico  

        T removerDoTopo() throws Exception; // desempilha

        T cosultarTopo() throws Exception; // consultar quem está no topo 

        boolean isEmpty();
        boolean isFull();

        void show(); // mostrar => auxiliar 
}
