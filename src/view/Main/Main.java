package view.Main;

import model.hotel.Hotel;
import model.room.Room;
import model.room.RoomBusiness;
import model.room.RoomNormal;
import model.room.RoomVip;
import view.LoadBeforeRun;
import view.display.Display;

public class Main implements IMain {
    public static void main(String[] args) {
        Display display = new Display();
        LoadBeforeRun.loadBeforeRun(display);
        display.displayMenu();
    }
}
