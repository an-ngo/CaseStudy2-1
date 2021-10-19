package model.user;

import model.room.Room;

import java.util.ArrayList;
import java.util.List;

public class User implements IUser{
    String username;
    String password;
    private String name;
    private int age;
    private List<Room> roomOfUser = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void showALlRoomOfUser(){
        System.out.println("--------------------------");
        for (int i = 0; i < roomOfUser.size(); i++) {
            System.out.println((i+1) + " " + roomOfUser.get(i).toString());
        }
        System.out.println("------------------------");
    }

    public void addBookedRoomToUser(Room room){
        roomOfUser.add(room);
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", roomOfUser=" + roomOfUser +
                '}';
    }
}
