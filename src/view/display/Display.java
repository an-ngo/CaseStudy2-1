package view.display;
import controller.hotelManager.HotelManager;
import controller.userManager.UserManager;
import model.hotel.Hotel;
import model.room.Room;
import model.user.User;

import java.util.Scanner;

public class Display implements IDisplay {
    public HotelManager hotelManager = new HotelManager();
    public UserManager userManager = new UserManager();
    public Display display;
    public Hotel hotel;
    public User user;

    @Override
    public void displayHotelInfo(Hotel hotel) {
        System.out.println("--------------------------");
        System.out.println(hotel.toString());
        System.out.println("--------------------------");

    }

    @Override
    public void displayRoomInfo(Room room) {
    hotelManager.toString();
    }

    @Override
    public void displayAllHotel() {
    hotelManager.showAllHotelList();
    }

    @Override
    public void loginFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please login your account");
        System.out.println("UserName");
        String userName = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();
        for (User user :
                userManager.getUserList()) {
            if(user.getUsername().equals(userName) && user.getPassword().equals(password)){
                System.out.println("Login success");
                this.user = user;
                this.displaySecondMenu();
            }
        }
        System.out.println("Wrong username or password");
        this.displayMenu();
    }

    @Override
    public void registerFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your account");
        System.out.println("Input UserName");
        String userName = scanner.nextLine();
        System.out.println("Input Password");
        String password = scanner.nextLine();
        for (User user :
                userManager.getUserList()) {
            if(user.getUsername().equals(userName)){
                System.out.println("UserName has been used, please input another userName");
                this.registerFunction();
            }
        }
        User user = new User(userName,password);
        this.user=user;
        userManager.addUser(user);
        System.out.println("Register success");
        this.displaySecondMenu();
    }

    @Override
    public void displayMenu() {
        System.out.println("Input your choice");
        System.out.println("1: Login");
        System.out.println("2: Register");
        System.out.println("3: Quit");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                this.loginFunction();
                break;
            case 2:
                this.registerFunction();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Wrong input");
                displayMenu();
        }
    }

    @Override
    public void displaySecondMenu() {
        System.out.println("Input your choice");
        System.out.println("1: Show all Hotel");
        System.out.println("2: view a Hotel info");
        System.out.println("3: Back to previous");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                displayAllHotel();
                displaySecondMenu();
            case 2:
                System.out.println("Input index of hotel");
                int index = scanner.nextInt();
                this.hotel=hotelManager.getHotelList().get(index);
                displayHotelInfo(hotel);
                displayThirdMenu();
            case 3:
                displayMenu();
            default:
                System.out.println("Wrong input");
                displaySecondMenu();
        }
    }

    @Override
    public void displayThirdMenu() {
        System.out.println("Input your choice");
        System.out.println("1: show all room info");
        System.out.println("2: Book Room");
        System.out.println("3: Show all your room in this hotel");
        System.out.println("4: Back to previous Menu");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input){
            case 1:
                hotel.showAllRoom();
                displayThirdMenu();
            case 2:
                System.out.println("Input index of room u want");
                int index = scanner.nextInt();
                user.addBookedRoomToUser(hotel.getRoomList().get(index));
                System.out.println("success book room");
                displayThirdMenu();
            case 3:
                user.showALlRoomOfUser();
                displayThirdMenu();
            case 4:
                displaySecondMenu();
            default:
                System.out.println("Wrong input");
                displayThirdMenu();

        }
    }


}
