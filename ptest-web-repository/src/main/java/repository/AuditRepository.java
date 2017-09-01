package repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by chandrashekarj on 8/31/2017.
 */
public class AuditRepository {
    DataSource ds ;
    public AuditRepository(DataSource ds) {
        this.ds = ds;
    }
    public boolean saveAuditMessage(String msg, int userId) throws SQLException {
        Connection c = ds.getConnection();

        //TODO
        return false;
    }
}
