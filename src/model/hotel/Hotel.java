package model.hotel;

import model.room.Room;
import model.room.RoomVip;
import view.display.Display;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements IHotel{
    public Display display;
    private String name;
    private double rate;
    private int numberFloor;
    private int numberRoom;
    List<Room> roomList= new ArrayList<>();

    public Hotel(String name, double rate, int numberFloor, int numberRoom) {
        this.name = name;
        this.rate = rate;
        this.numberFloor = numberFloor;
        this.numberRoom = numberRoom;
    }

    public Hotel() {
        roomList.add(new RoomVip(10));

    }
    
    public void addRoom(Room room){
                roomList.add(room);

    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getRate() {
        return this.rate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", numberFloor=" + numberFloor +
                ", roomList=" + roomList +
                '}';
    }


    @Override
    public void showAllRoom(){
        for (int i = 0; i < roomList.size(); i++) {
            System.out.println("--------------------------");
            System.out.println((i+1)+" "+roomList.get(i).toString());
            System.out.println("--------------------------");

        }
    }
}
