package lab_3.manufacturing;

import lab_3.model.Guitar;

public class AttachStringsManufacturingStage extends ManufacturingStage {

    private final String stringsType;
    private final int numberOfStrings;

    public AttachStringsManufacturingStage(String stringsType, int numberOfStrings) {
        this.stringsType = stringsType;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public Guitar processGuitar(Guitar guitar) {
        guitar.setNumberOfStrings(numberOfStrings);
        guitar.setStringsType(stringsType);

        return moveToNextStage(guitar);
    }
}
