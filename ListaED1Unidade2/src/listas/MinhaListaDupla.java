package listas;

public class MinhaListaDupla<T> implements InterfaceListas<T> {

    // Classe Interna Node
    class Node {
        // Atributos de Node
        T data;
        Node next;
        Node prev; // novo atributo => lista ligada sabe o elemento anterior

        // Construtor de Node
        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null; // elemento anterior
        }
    }

    // Atributos de Lista ligada
    public Node head;
    public Node tail;
    public int size;

    // Construtor da minha Lista ligada
    public MinhaListaDupla() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T value) {
        Node novo = new Node(value);

        // comecar atribuindo os campos null
        if (head == null) {
            head = novo; // novo será o primeiro elemento
            tail = novo; // novo será o último elemento
        } else {
            // Anexa
            novo.next = head;
            head.prev = novo; // prev da lista dupla
            head = novo;
        }

        size++;
    }

    public void addLast(T value) {
        Node novo = new Node(value);

        // verifica se lista está vazia
        if (head == null) {
            head = novo; // novo será o primeiro elemento
            tail = novo; // novo será o último elemento
        } else {
            // Anexa
            novo.prev = tail; // novidade. Lembre-se de começar a anexação pelo novo elemento
            tail.next = novo;
            tail = novo;
        }

        size++;
    }

    public void addAfter(T dado, T criterio) {
        // Antecessor
        Node p = searchNode(criterio);

        if (p == null) // Verifica se o criterio existe
        {
            System.out.println("Criterio invalido \n");
        } else {
            // Novo elemento
            Node novo = new Node(dado);

            // Atualiza tail quando o elemento criterio e o ultimo
            if (p.next == null) {
                tail = novo;
            }

            // comecar atribuindo os campos null => anexar
            novo.next = p.next;
            novo.prev = p; // dupla encadeada
            p.next = novo;

            // novidade
            Node frente = novo.next; // var auxiliar
            if (frente != null) { // previne nullpoint quando add no tail
                frente.prev = novo;
            }

            size++;
        }
    }

    public T peekFirst() {
        if (head == null) {
            System.out.println("Lista Vazia!!! \n");
            return null;
        } else {
            return head.data;
        }
    }

    public T peekLast() {
        if (tail == null) {
            System.out.println("Lista Vazia!!! \n");
            return null;
        } else {
            return tail.data;
        }
    }

    private Node searchNode(T criterio) {
        Node p = head; // ponteiro temporario

        while (p != null) {
            /*
             * critério de comparação será aquele
             * que foi definido na sua classe-entidade
             * nos métodos equals() e hashCode().
             * Se não houver esta definição, um objeto
             * será considerado igual se todos os atributos
             * forem iguais.
             */
            if (p.data.equals(criterio)) {
                System.out.println();
                return p;
            }
            p = p.next;
        }

        return null;
    }

    public T search(T criterio) {
        Node p = searchNode(criterio);

        if (p == null) {
            return null;
        } else {
            return p.data;
        }
    }

    public T removeFirst() {
        Node p = head;
        T dadoRetorno = null;

        if (head == null) {
            System.out.println("Lista Vazia!!! \n");
        } else {
            dadoRetorno = p.data;

            if (head == tail) {
                System.out.println("Remove unico elemento\n");
                head = null;
                tail = null;
            } else {
                System.out.println("Remove primeiro elemento, mas ha mais outros\n");
                head = head.next;
                head.prev = null; // novidade
            }

            p.next = null; // isola elemento removido

            size--;
        }

        return dadoRetorno;
    }

    public T removeLast() {
        T dadoRetorno = null;

        if (tail == null) {
            System.out.println("Lista Vazia!!! \n");
            return null;
        } else {
            dadoRetorno = tail.data;

            if (head == tail) {
                System.out.println("Remove unico elemento\n");
                head = null;
                tail = null;
            } else {
                System.out.println("Remove ultimo elemento, mas ha mais outros\n");
                Node anterior = tail.prev; // lista dupla
                tail.prev = null; // lista dupla
                tail = anterior;
                tail.next = null;
            }

            // OBS: nao precisa isolar elemento pois o next do tail é sempre null.

            size--;
        }

        return dadoRetorno;
    }

    public T remove(T criterio) {

        T dadoRetorno = null;

        if (head == null) {
            System.out.println("Lista Vazia!!! \n");
            return null;
        }

        Node anterior = null;
        Node removido = searchNode(criterio); // null: criterio nao existe OU criterio esta no 1o elemento

        if (removido != null) {
            anterior = removido.prev; // evita nullpointer
        }

        if (anterior == null) {
            if (head.data.equals(criterio) == false) {
                System.out.println("criterio nao existe!!! \n");
                return null;
            } else {
                return removeFirst();
            }
        } else {
            System.out.println("Remove elemento meio ou ultimo \n");

            if (removido == tail) {
                return removeLast();
            } else {
                System.out.println("Remove meio \n");
                Node frente = removido.next; // var auxiliar

                // se desliga do elemento removido
                anterior.next = frente;
                frente.prev = anterior; // novidade

                // isola elemento removido
                removido.next = null;
                removido.prev = null; // novidade

                size--;

                dadoRetorno = removido.data;
                return dadoRetorno;
            }
        }

    }

    public void show() {
        Node p = head;

        if (p == null) {
            System.out.println("LISTA VAZIA \n");
        } else {
            while (p != null) {
                System.out.println("\n Dado: " + p.data + "\n");

                p = p.next;
            }
        }

        System.out.println("size = " + size + "\n");
    }

    public void showReverse() {
        Node p = tail; // novidade

        if (p == null) {
            System.out.println("LISTA VAZIA \n");
        } else {
            while (p != null) {
                System.out.println("\n Dado: " + p.data);

                p = p.prev; // novidade
            }
        }

        System.out.println("size = " + size + "\n");
    }

}
