package model.room;

public class RoomVip extends Room implements IRoom{
    private EnumRoomType type = EnumRoomType.Vip;
    public RoomVip(int numberRoom) {
        super(numberRoom);
    }

    @Override
    public EnumRoomType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "RoomVip{" +
                "type=" + type +
                '}';
    }
}
