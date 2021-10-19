package model.room;

public class RoomNormal extends Room implements IRoom {
    private EnumRoomType type = EnumRoomType.Normal;
    public RoomNormal(int numberRoom) {
        super(numberRoom);
    }

    @Override
    public EnumRoomType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "RoomNormal{" +
                "type=" + type +
                '}';
    }


}
