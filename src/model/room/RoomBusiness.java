package model.room;

public class RoomBusiness extends Room implements IRoom {
    private EnumRoomType type = EnumRoomType.business;

    public RoomBusiness(int numberRoom) {
        super(numberRoom);
    }

    @Override
    public EnumRoomType getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "RoomBusiness{" +
                "type=" + type +
                '}';
    }
}
