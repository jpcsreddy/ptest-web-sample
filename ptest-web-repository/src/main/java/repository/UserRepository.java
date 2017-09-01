package repository;

import javax.sql.DataSource;
import contracts.data.User;

/**
 * Created by chandrashekarj on 8/28/2017.
 */
public class UserRepository {
    DataSource ds;

    public  UserRepository(DataSource ds)
    {
        this.ds = ds;
    }

    public boolean saveUser(User u)
    {
        return false;
    }
}
