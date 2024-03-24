package patterns.behavioral.iterator;

// Concrete Aggregate implementation
public class MyArray<T> implements MyCollection<T> {
    private final T[] elements;

    public MyArray(T[] elements) {
        this.elements = elements;
    }

    @Override
    public MyIterator<T> createIterator() {
        return new ArrayIterator<>(elements);
    }
}
