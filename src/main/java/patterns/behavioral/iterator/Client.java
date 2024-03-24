package patterns.behavioral.iterator;

// Client code
public class Client {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        MyCollection<Integer> collection = new MyArray<>(numbers);

        // Get iterator and iterate over elements
        MyIterator<Integer> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
