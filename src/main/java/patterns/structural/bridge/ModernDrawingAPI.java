package patterns.structural.bridge;

// Concrete Implementor
public class ModernDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Modern API, circle, x: " + x + ", y: " + y + ", radius: " + radius);
    }

    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        System.out.println("Modern API, rectangle, x1: " + x1 + ", y1: " + y1 + ", x2: " + x2 + ", y2: " + y2);
    }
}
