package lab_3.manufacturing;

import lab_3.audit.ShippingNotificator;
import lab_3.model.Guitar;

public class GuitarManufacturer {

    private ShippingNotificator shippingNotificator;

    public GuitarManufacturer(ShippingNotificator shippingNotificator) {
        this.shippingNotificator = shippingNotificator;
    }

    public Guitar manufactureGuitar(final String color, final int nrOfStrings, final String stringsType, String humbuckerType){
        final var humbuckerInstallationManufacturingStage = new HumbuckerInstallationManufacturingStage(humbuckerType);
        final var paintingManufacturingStage = new PaintingManufacturingStage(color);
        final var attachStringsManufacturingStage = new AttachStringsManufacturingStage(stringsType, nrOfStrings);
        final var firstStage = ManufacturingStage.link(humbuckerInstallationManufacturingStage, paintingManufacturingStage, attachStringsManufacturingStage);
        Guitar result = firstStage.processGuitar(new Guitar());
        shippingNotificator.notifyShippingService();

        return result;
    }

    public void setShippingNotificator(ShippingNotificator shippingNotificator) {
        this.shippingNotificator = shippingNotificator;
    }
}
