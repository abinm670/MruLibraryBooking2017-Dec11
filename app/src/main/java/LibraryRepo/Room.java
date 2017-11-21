package LibraryRepo;

import java.util.List;

/**
 * Room Class
 * Has the room number and all the times when the room is AVAILABLE
 */

public class Room {

    private String RoomNumber;
    /**
     * Available times
     */
    private List<TimeSlot> AvaliableTimes = null;

    public Room(String roomNumber, List<TimeSlot> avaliableTimes) {
        RoomNumber = roomNumber;
        AvaliableTimes = avaliableTimes;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public List<TimeSlot> getAvaliableTimes() {
        return AvaliableTimes;
    }

    protected Room setAvaliableTimes(List<TimeSlot> avaliableTimes) {
        AvaliableTimes = avaliableTimes;
        return this;
    }
}
