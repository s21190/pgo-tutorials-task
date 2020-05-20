package Task1;

public class Parallelogram implements Figure {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
private String type = "Task1.Parallelogram";
    public Parallelogram(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA*2) + (sideB*2);
    }

    @Override
    public double getArea() {
        return base*height;
    }

    @Override
    public String getType() {
        return type;
    }
}
