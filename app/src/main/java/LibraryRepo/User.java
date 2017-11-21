package LibraryRepo;

/**
 * Created by fbuls722 on 11/18/2017.
 */

public class User {

    private String email;
    /**
     * Firebase uses User UID so I shall too
     */
    private String UUID;

    public User(String email, String UUID) {
        this.email = email;
        this.UUID = UUID;
    }
}
