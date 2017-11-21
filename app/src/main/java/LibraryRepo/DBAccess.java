package LibraryRepo;

import java.util.Date;
import java.util.List;

/**
 * Use this to access firebase and the contract
 * Login MUST be used before get instance
 * there will only be 1 user object and it will live here
 *
 */

public class DBAccess implements RoomContract,UserContract {
    /**
     * Empty constructor for singleton
     */
    private DBAccess(){}

    private DBAccess INSTANCE=null;
    private User user = null;

    @Override
    public void LogIn(String email, String password){
        //TODO add exception if email password is invalid
        if (INSTANCE == null){
            //TODO add firebase and user initialization here

            INSTANCE = new DBAccess();
        }
    }
    /**
     * Get instance of firebase access
     * @return
     */
    public DBAccess GetInstance(){
        //TODO add exception for user not logged in


        return INSTANCE;
    }



    @Override
    public List<Room> getAvailableRooms(Date date) {
        return null;
    }


    @Override
    public boolean setBooking(Room room, TimeSlot timeSlot) {
        return false;
    }
}
