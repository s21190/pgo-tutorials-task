package task2;

import java.util.ArrayList;

public class House {
    private String address;
    private ArrayList roomList = new ArrayList();
    private static int roomCount;

    public House() {
    }

    private House(String address) {

        this.address = address;
        System.out.println(address);
    }

    public static String createHouse(String address) {
        new House(address);

        return "object of house "+new House(address).toString();


    }

    public void addRoom(String room) {

        roomList.add(room);
        ++roomCount;

    }


    public void addRoom(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            roomList.add(arr.get(i));
            ++roomCount;
        }
    }

    public static int getRoomCount() {
        System.out.print("room count = ");
        return roomCount;
    }

    public void printRooms() {
        System.out.println("-------THE ROOM NAME----- ");
        for (int i = 0; i < roomList.size(); i++) {

System.out.println(roomList.get(i));
        }

    }

}
