package lab_3.audit;

public class EmailShippingNotificator implements ShippingNotificator {

    @Override
    public void notifyShippingService() {
        System.out.println("Sending email");
    }
}
