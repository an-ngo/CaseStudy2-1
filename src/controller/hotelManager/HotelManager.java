package controller.hotelManager;

import model.hotel.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelManager implements IHotelManager {
    List<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel){
            hotelList.add(hotel);

    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    @Override
    public void bookRoom() {

    }

    @Override
    public void checkOutRoom() {

    }

    @Override
    public void showAllHotelList() {
        System.out.println("--------------------------");

        for (Hotel hotel :
                hotelList) {
            System.out.println(hotel.toString());
        }
        System.out.println("--------------------------");

    }
}
