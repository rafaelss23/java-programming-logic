import java.util.EmptyStackException;
import java.util.Arrays;

/**
 * Simulação de uma Pilha (Stack) usando Generics.
 * Segue o princípio LIFO (Last-In, First-Out).
 * @param <T> O tipo de elemento armazenado na pilha.
 */
public class StackSimulation<T> {
    private Object[] elements;
    private int top = -1;
    private static final int DEFAULT_CAPACITY = 10;

    public StackSimulation() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Empilha um elemento. Se o array estiver cheio, ele dobra de tamanho.
     * @param value Elemento a ser adicionado.
     */
    public void push(T value) {
        if (top == elements.length - 1) {
            ensureCapacity();
        }
        elements[++top] = value;
    }

    /**
     * Desempilha o elemento do topo.
     * @return O elemento removido.
     * @throws EmptyStackException se a pilha estiver vazia.
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = (T) elements[top];
        elements[top--] = null; // Boa prática: evita memory leak
        return value;
    }

    /**
     * Apenas observa o elemento no topo sem removê-lo.
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return (T) elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}