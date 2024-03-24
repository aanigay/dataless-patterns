package patterns.structural.bridge;

public interface DrawingAPI {
    void drawCircle(int x, int y, int radius);
    void drawRectangle(int x1, int y1, int x2, int y2);
}
