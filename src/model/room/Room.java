package model.room;

public abstract class Room implements IRoom {
    private int numberRoom;
    private EnumRoomType type;
    private boolean status;

    public Room(int numberRoom) {
        this.numberRoom = numberRoom;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public abstract EnumRoomType getType();

    @Override
    public int getNumberRoom() {
        return numberRoom;
    }


}
