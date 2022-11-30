package lab_3.manufacturing;

import lab_3.model.Guitar;
import lab_3.audit.EmailShippingNotificator;
import lab_3.audit.ShippingNotificator;

public abstract class ManufacturingStage {

    private ManufacturingStage next;
    private static ShippingNotificator shippingNotificator = new EmailShippingNotificator();

    public static ManufacturingStage link(ManufacturingStage first, ManufacturingStage... chain) {
        ManufacturingStage head = first;
        for(ManufacturingStage stage : chain){
            head.next = stage;
            head = stage;
        }

        return first;
    }

    public abstract Guitar processGuitar(Guitar guitar);

    public Guitar moveToNextStage(Guitar guitar){
        if(next == null){
            shippingNotificator.notifyShippingService();
            return guitar;
        }

        return next.processGuitar(guitar);
    }
}
