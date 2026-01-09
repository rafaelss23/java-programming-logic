import java.util.NoSuchElementException;

/**
 * Simulação de uma Fila (Queue) usando Array Circular.
 * Segue o princípio FIFO (First-In, First-Out).
 */
public class QueueSimulation {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueSimulation(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    /**
     * Adiciona um elemento ao final da fila.
     * @param value valor a ser inserido.
     */
    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia (Overflow).");
        }
        // Lógica circular: quando chega no fim do array, volta para o índice 0
        rear = (rear + 1) % capacity;
        elements[rear] = value;
        size++;
    }

    /**
     * Remove e retorna o elemento do início da fila.
     * @return o valor removido.
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia (Underflow).");
        }
        int removedValue = elements[front];
        // Avança o ponteiro front de forma circular
        front = (front + 1) % capacity;
        size--;
        return removedValue;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }
}