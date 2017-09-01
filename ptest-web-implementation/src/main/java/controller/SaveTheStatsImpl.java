package controller;

import contracts.data.UserMassage;
import repository.AuditRepository;

import java.sql.SQLException;

/**
 * Created by chandrashekarj on 8/28/2017.
 */
public class SaveTheStatsImpl implements SaveTheStats {
    AuditRepository auditRepo;

    public SaveTheStatsImpl(AuditRepository ar) {
        this.auditRepo = ar;
    }

    @Override
    public boolean saveTheUser(String uname) {
        return false;
    }

    @Override
    public boolean saveTheUserMessage(UserMassage um) throws SQLException {
        return auditRepo.saveAuditMessage(um.getMsg().getMessageText(),um.getUserdata().getUserId());
    }
}
