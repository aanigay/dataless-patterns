package patterns.behavioral.iterator;

// Aggregate interface
public interface MyCollection<T> {
    MyIterator<T> createIterator();
}
