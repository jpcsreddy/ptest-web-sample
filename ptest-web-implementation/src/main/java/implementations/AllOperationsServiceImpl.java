package implementations;

import contracts.service.AllOperationsService;

/**
 * Created by chandrashekarj on 8/28/2017.
 */
public class AllOperationsServiceImpl implements AllOperationsService {

    String author;

    public AllOperationsServiceImpl(String author)
    {
        this.author = author;
    }

    public String sayHiTo(final String name) {
        return "hi" + name;
    }

    public String hitMeAgainToday(final String name) {
        return "Again -hi- " + name;
    }

    public String sayByeTo(final String name) {
        return "bye "+ name;
    }
}