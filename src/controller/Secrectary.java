package controller;

public class Secrectary implements IManager {
    private Boss boss;

    public Secrectary(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void generateHotel(String name, double rate, int numberFloor, int numberRoom) {
        boss.generateHotel(name,rate,numberFloor,numberRoom);
    }
}
