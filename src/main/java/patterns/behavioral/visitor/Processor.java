package patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Processor {
    private List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }
    public void processElements(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
