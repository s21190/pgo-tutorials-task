package Task1;

public class Car extends Vehicle {

    private int numberOfSeats;


    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    @Override
public void start(){
        System.out.println("car has started task2\n");

}

    @Override

    public void stop(){
        System.out.println("car has stoped task2 \n");
    }

}
