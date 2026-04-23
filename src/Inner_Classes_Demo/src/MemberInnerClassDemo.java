package Inner_Classes_Demo.src;

class OuterHouse {
    private String houseName = "Green Villa";

    // Member inner class is defined inside another class.
    class Room {
        void displayRoom() {
            // Inner class can access outer class private members.
            System.out.println("Room belongs to house: " + houseName);
        }
    }
}

public class MemberInnerClassDemo {

    public static void main(String[] args) {
        OuterHouse house = new OuterHouse();
        OuterHouse.Room room = house.new Room();
        room.displayRoom();
    }
}
