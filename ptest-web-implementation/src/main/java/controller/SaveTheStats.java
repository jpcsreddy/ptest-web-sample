package controller;

import contracts.data.UserMassage;

import java.sql.SQLException;

/**
 * Created by chandrashekarj on 8/28/2017.
 */
public interface SaveTheStats {

    boolean saveTheUser(String uname);
    boolean saveTheUserMessage(UserMassage um)  throws SQLException ;
}
