package patterns.behavioral.memento;

// Caretaker class
public class Caretaker {
    private final Originator originator;
    private Memento memento;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void backup() {
        memento = originator.saveStateToMemento();
    }

    public void restore() {
        if (memento != null) {
            originator.restoreStateFromMemento(memento);
        } else {
            System.out.println("Nothing to restore.");
        }
    }
}
