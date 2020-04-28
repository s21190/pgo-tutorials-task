package task1;

import java.util.ArrayList;

public class Room {

    private int vatPrice=10000;
    ArrayList room  = new ArrayList();


    public Room(int area  , String  furniture  ) {
room.add(area);
room.add(furniture);

    }


    public int getVatPrice() {
        System.out.print("VAT PRICE = ");
        return  vatPrice;
    }

    public ArrayList getRoom() {
        System.out.print("room NUMBER = ");
        return  room;
    }
}
