package controller;

import model.hotel.Hotel;

import java.util.List;

public class Boss implements IManager {
    private List<Hotel> hotelList;

    @Override
    public void generateHotel(String name, double rate, int numberFloor,int numberRoom) {
        Hotel hotel = new Hotel(name,rate,numberFloor,numberRoom);
        hotelList.add(hotel);
    }
}
