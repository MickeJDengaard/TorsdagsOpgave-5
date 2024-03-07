package TaskThree;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;
    public int getnumberOfFloors(){
        return numberOfFloors;
    }


    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
    this.rooms = rooms;
    this.numberOfBathrooms = numberOfBathrooms;
    this.numberOfFloors = numberOfFloors;
    this.isOfficeBuilding = isOfficeBuilding;
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public int getnumberOfBathrooms(){
        return numberOfBathrooms;
    }

    public boolean getisOfficeBuilding(){
        return isOfficeBuilding;
    }

}
