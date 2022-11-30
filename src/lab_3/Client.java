package lab_3;

import lab_3.audit.EmailShippingNotificator;
import lab_3.audit.SmsShippingNotificator;
import lab_3.manufacturing.*;
import lab_3.model.Guitar;

public class Client {

    public static void main(String[] args) {
        GuitarManufacturer guitarManufacturer = new GuitarManufacturer(new EmailShippingNotificator());
        Guitar guitar1 = guitarManufacturer.manufactureGuitar("red", 6, "steel", "single coil");
        System.out.println(guitar1);
        guitarManufacturer.setShippingNotificator(new SmsShippingNotificator());
        Guitar guitar2 = guitarManufacturer.manufactureGuitar("blue", 8, "steel", "double coil");
        System.out.println(guitar2);
    }
}
