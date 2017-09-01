package contracts.data;

/**
 * Created by chandrashekarj on 8/31/2017.
 */
public class UserMassage {
    public User getUserdata() {
        return userdata;
    }

    public void setUserdata(User userdata) {
        this.userdata = userdata;
    }

    public Message getMsg() {
        return msg;
    }

    public void setMsg(Message msg) {
        this.msg = msg;
    }

    User userdata;
    Message msg;

    public UserMassage(User u, Message m) {
        this.userdata = u;
        this.msg = m;
    }
}
