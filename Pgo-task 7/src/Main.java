import task1.Furniture;
import task1.Room;
import task2.House;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args){






  Furniture d1 =new Furniture("chair",1399) ;
House b1= new House();
Room s1 = new Room(1019,"chair,bed,table");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("sleeping room");
        arr.add("kitken room");
        arr.add(" game  room");
        arr.add("gym room");
        arr.add("waiting room");

        System.out.println(d1.getPrice());
        System.out.println(d1.getPrice(10000));

b1.addRoom( arr);
b1.addRoom("bathing room");
System.out.println(s1.getVatPrice());

        System.out.println(s1.getRoom());
        System.out.println(b1.createHouse("1 malshakwoska"));
        System.out.println(b1.getRoomCount());
         b1.printRooms();


    }
}
