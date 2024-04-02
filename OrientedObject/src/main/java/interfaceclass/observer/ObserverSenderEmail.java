package interfaceclass.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverSenderEmail extends Observer {
    private List<String> listEmails;

    public ObserverSenderEmail(Subject subject) {
        this.listEmails = new ArrayList<>();
        subject.attach(this);
    }

    public void getAllEmails() {
        for(String email: listEmails) {
            System.out.println(email);
        }
    }

    public void addEmail(String email) {
        listEmails.add(email);
    }

    @Override
    public void update() {
        getAllEmails();
    }
}
