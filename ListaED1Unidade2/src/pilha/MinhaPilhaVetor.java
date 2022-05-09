package pilha;

public class MinhaPilhaVetor<T> implements InterfacePilha<T> {

	int size;
	private Object[] arrayPilha;
	int topo;

	public MinhaPilhaVetor(int tamanho) {
		this.topo = -1;
		this.size = tamanho;
		this.arrayPilha = new Object[tamanho];
	}

	public void colocarNoTopo(T valor) throws Exception {
		System.out.println("Empilhando...");

		if (topo == size + 1) {
			// throw new erro => ideal
			System.out.println("Erro, pilha cheia");
		}

		topo = topo + 1;
		arrayPilha[topo] = valor;

	}

	@SuppressWarnings("unchecked")
	public T removerDoTopo() throws Exception {
		T retorno;

		System.out.println("Desempilhando...");

		if (topo == -1) {
			System.out.println("Pilha vazia...");
		}

		retorno = (T) arrayPilha[topo];
		topo = topo - 1;

		return retorno;
	}

	@SuppressWarnings("unchecked")
	public T cosultarTopo() throws Exception {
		T retorno;

		System.out.println("Mostrando topo...");

		if (topo == -1) {
			System.out.println("Pilha vazia ...");
		}

		retorno = (T) arrayPilha[topo];

		return retorno;
	}

	@Override
	public boolean isEmpty() {
		if (topo == -1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isFull() {
		if (topo == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void show() {
		for (int i = 0; i <= topo; i++) {
			System.out.println("posição " + i + " = " + arrayPilha[i]);
		}
		System.out.println("Topo index = " + topo + "\n");

	}

}