package holdmeindb;

import javax.sql.DataSource;

/**
 * Created by chandrashekarj on 8/28/2017.
 */
public class UserRepository {
    DataSource ds;

    public  UserRepository(DataSource ds)
    {
        this.ds = ds;
    }

}
