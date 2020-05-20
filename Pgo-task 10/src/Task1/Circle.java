package Task1;

public class Circle implements Figure {

   private double pie ;
   private double radius;
private  String circle = "Task1.Circle";
    public Circle(double pie, double radius) {
        this.pie = pie;
        this.radius = radius;
    }

    @Override
    public double getPerimeter( ) {
        return pie*(2* radius) ;
    }

    @Override
    public double getArea() {
        return pie* (Math.pow(radius,2)) ;
    }

    @Override
    public String getType() {
        return circle;
    }
}

