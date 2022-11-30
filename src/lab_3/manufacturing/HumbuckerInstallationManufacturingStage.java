package lab_3.manufacturing;

import lab_3.model.Guitar;

public class HumbuckerInstallationManufacturingStage extends ManufacturingStage {

    private final String humbucker;

    public HumbuckerInstallationManufacturingStage(String humbucker) {
        this.humbucker = humbucker;
    }

    @Override
    public Guitar processGuitar(Guitar guitar) {
        guitar.setHumbucker(humbucker);

        return moveToNextStage(guitar);
    }
}
