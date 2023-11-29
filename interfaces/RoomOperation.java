package interfaces;

import classes.Room;

public interface RoomOperation {

    void insertRoom(Room r);

    void removeRoom(Room r);

    Room getRoom(int RoomNumber);

    void showAllRoom();

}