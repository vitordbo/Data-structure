package fila;

public interface InterfaceFila<T> {

    void add(T number) throws Exception; // fila => adiociona no fim

    T remove() throws Exception;

    T consultaInicio() throws Exception; // primeiro elemento

    boolean isEmpty();

    boolean isFull();

    void show();
}
