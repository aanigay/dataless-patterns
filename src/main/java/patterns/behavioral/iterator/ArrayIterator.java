package patterns.behavioral.iterator;

// Concrete Iterator implementation
public class ArrayIterator<T> implements MyIterator<T> {
    private final T[] array;
    private int currentIndex = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        return array[currentIndex++];
    }
}
