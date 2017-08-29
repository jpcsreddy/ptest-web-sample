package implementations;

import contracts.data.User;
import contracts.service.AllOperationsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by chandrashekarj on 8/28/2017.
 */
public class AllOperationsServiceImpl implements AllOperationsService {

    String author;
    private static Logger logger = LoggerFactory.getLogger(AllOperationsServiceImpl.class);

    public AllOperationsServiceImpl(String author)
    {
        this.author = author;

    }

    public User sayHiTo(final String name) {
        User u = new User();
        u.setName(name);
        logger.debug("got hi from" + name);
        return u;
    }

    public String hitMeAgainToday(final String name) {
        return "Again -hi- " + name;
    }

    public String sayByeTo(final String name) {
        return "bye "+ name;
    }
}