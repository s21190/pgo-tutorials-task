import Task1.Circle;
import Task1.Figure;
import Task1.Parallelogram;
import Task1.Rectangle;
import Task2.Cat;
import Task3.Manager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Rectangle c1 = new Rectangle (44.8,20.2);
        Parallelogram b1 = new Parallelogram(167.2,7234.8,50.0,67.3);
        Circle a1 = new Circle(3.142,49);
        Cat d1 = new Cat("alicia");
        Manager manager = new Manager("jake","thomas",1989,2007,"mcdonalds",4500,578);
        ArrayList<Figure>  list = new ArrayList<>();
        list.add(a1);
        list.add(b1);
        list.add(c1);


        for (Figure e : list){
            System.out.println(e.getType());
            System.out.println("Area: " + e.getArea() + " units.");
            System.out.println("Perimeter: " + e.getPerimeter() + " units.\n");

        }
        d1.start();
        System.out.println(d1.getType());
        d1.stop();

        System.out.println(manager);
    }
}
