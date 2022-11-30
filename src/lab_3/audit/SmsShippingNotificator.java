package lab_3.audit;

public class SmsShippingNotificator implements ShippingNotificator {

    @Override
    public void notifyShippingService() {
        System.out.println("Sending sms");
    }
}
