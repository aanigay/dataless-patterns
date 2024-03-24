package patterns.structural.bridge;

// Refined Abstraction
public class CircleShape extends Shape {
    private final int x;
    private final int y;
    private final int radius;

    public CircleShape(DrawingAPI drawingAPI, int x, int y, int radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}
