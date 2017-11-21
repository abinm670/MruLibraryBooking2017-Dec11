package LibraryRepo;

/**
 * Created by fbuls722 on 11/18/2017.
 */

public interface UserContract {

    /**
     * Autinticate the user against the database
     * @param email of the user
     * @param password of the user
     */
    void LogIn(String email, String password);

}
