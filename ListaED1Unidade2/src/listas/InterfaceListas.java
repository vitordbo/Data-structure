package listas;

public interface InterfaceListas<T> {

    void addFirst(T value);

    void addLast(T value);

    void addAfter(T dado, T crit); // um pra saber qual é, e outro para o valor

    T peekFirst();

    T peekLast();

    T search(T crit);

    T removeFirst();

    T removeLast();

    T remove(T crit);

    void show();

    void showReverse();
}
