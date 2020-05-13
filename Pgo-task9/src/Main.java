import Task1.Car;
import Task1.Vehicle;
import Task2.Animal;
import Task2.Cat;
import Task2.Dog;
import Task2.Lion;
import Task2.Wolf;

import Task3.Canine;
import Task3.Feline;

import javax.swing.event.AncestorEvent;


public class Main {

    public static void main (String[] args){

        Car a1= new Car(56);
Animal c1 = new Animal ();
Cat d1= new Cat ();
Dog t1 = new Dog();
Lion f1= new Lion();
Wolf v1 = new Wolf();
Vehicle a2 =new Vehicle();
        Task3.Animal g1= new Task3.Animal();
        Canine m1 = new Canine();
        Feline j1 = new Feline();


a2.start();
a2.stop();
System.out.println(a1.getNumberOfSeats());
a1.start();
a1.stop();

c1.makeNoise();
d1.makeNoise();
t1.makeNoise();
f1.makeNoise();
v1.makeNoise();

g1.roam();
m1.roam();
j1.roam();
    }
}
