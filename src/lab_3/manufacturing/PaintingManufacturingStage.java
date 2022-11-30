package lab_3.manufacturing;

import lab_3.model.Guitar;

public class PaintingManufacturingStage extends ManufacturingStage {

    private final String color;

    public PaintingManufacturingStage(final String color){
        this.color = color;
    }

    @Override
    public Guitar processGuitar(Guitar guitar) {
        guitar.setColor(color);

        return moveToNextStage(guitar);
    }
}
