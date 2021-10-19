package view.display;

import model.hotel.Hotel;
import model.room.Room;

public interface IDisplay {
    public void displayHotelInfo(Hotel hotel);
    public void displayRoomInfo(Room room);
    public void displayAllHotel();
    public void loginFunction();
    public void registerFunction();
    public void displayMenu();
    public void displaySecondMenu();
    public void displayThirdMenu();
}
