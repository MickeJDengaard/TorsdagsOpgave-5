package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        Room room1 = new Room(1, 8, 3);
        Room room2 = new Room(3, 2, 1);
        Room room3 = new Room(2, 2, 2);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 2, 1, true);

        int totalLamps = countLampsInBuilding(building1);
        System.out.println("There is " + totalLamps + " lamps in the building");

        isNormal(building1);

    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
 }

    public static boolean isNormal(Building building){
        int i = 0;
        for (Room room : building.getRooms())   {
            i += building.getnumberOfFloors();
        }
        if (i > building.getRooms().size())
        return true;
     else {
            System.out.println("This is an odd building");
        return false;
        }
    }
}









