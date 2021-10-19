package view;

import model.hotel.Hotel;
import model.room.Room;
import model.room.RoomBusiness;
import model.room.RoomNormal;
import model.room.RoomVip;
import view.display.Display;

public class LoadBeforeRun {
    public static void loadBeforeRun(Display display){
        Hotel hotel1 = new Hotel("Binh An",2.5,3,6);
        Room room1 = new RoomNormal(11);
        Room room2 = new RoomBusiness(12);
        Room room3 = new RoomVip(13);
        hotel1.addRoom(room1);
        hotel1.addRoom(room2);
        hotel1.addRoom(room3);
        display.hotelManager.addHotel(hotel1);
        Hotel hotel2 = new Hotel("Kinh ngu",4,5,30);
        Room room4 = new RoomNormal(21);
        Room room5 = new RoomBusiness(22);
        Room room6 = new RoomVip(23);
        hotel2.addRoom(room4);
        hotel2.addRoom(room2);
        hotel2.addRoom(room3);
        display.hotelManager.addHotel(hotel2);
    }
}
