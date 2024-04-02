package interfaceclass.observer;

public class TestObserver {
    public static void main(String[] args) {
        Subject observado = new Subject();

        ObserverSenderEmail observer01 = new ObserverSenderEmail(observado);
        ObserverSenderSMS observer02 = new ObserverSenderSMS(observado);

        observer01.addEmail("mauricio@unichristus.edu");
        observer01.addEmail("joazinho@unichristus.edu");
        observer01.addEmail("fulaninho@unichristus.edu");

        observer02.addSMS("85 12345678");
        observer02.addSMS("85 87654321");
        observer02.addSMS("85 12340987");

        for (int i = 0; i < 4; i++) {
            if (observado.isEven(i)) {
                observado.notifyAllAttached();
            }
        }
    }
}
