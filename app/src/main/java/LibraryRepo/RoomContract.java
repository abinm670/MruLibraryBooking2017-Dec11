package LibraryRepo;

import java.util.Date;
import java.util.List;

/**
 * Created by abinm670 on 11/18/2017.
 */

public interface RoomContract {

    /**
     * Get available rooms for a specified date
     * @param date Year-Month-Date only, not the specific time
     * @return A Room object
     */
    List<Room> getAvailableRooms(Date date);

    /**
     *
     * @param room room object that wants to be booked
     * @param timeSlot from what time to what time do you want a room to be booked
     * @return success
     */
    boolean setBooking(Room room, TimeSlot timeSlot);


}
