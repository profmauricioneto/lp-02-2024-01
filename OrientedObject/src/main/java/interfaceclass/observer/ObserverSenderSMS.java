package interfaceclass.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverSenderSMS extends Observer {
    private List<String> listSMS;

    public ObserverSenderSMS(Subject subject) {
        this.listSMS = new ArrayList<>();
        subject.attach(this);
    }

    public void getAllSMS() {
        for(String sms: listSMS) {
            System.out.println(sms);
        }
    }

    public void addSMS(String sms) {
        listSMS.add(sms);
    }

    @Override
    public void update() {
        getAllSMS();
    }
}
