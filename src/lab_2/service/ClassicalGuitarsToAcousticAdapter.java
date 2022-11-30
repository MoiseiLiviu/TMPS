package lab_2.service;

import lab_2.domain.models.guitar.AcousticGuitar;
import lab_2.domain.models.guitar.ClassicalGuitar;
import lab_2.domain.models.guitar.GuitarSpecification;

public class ClassicalGuitarsToAcousticAdapter {

    private final ClassicalGuitarsService classicalGuitarsService;

    public ClassicalGuitarsToAcousticAdapter(ClassicalGuitarsService classicalGuitarsService) {
        this.classicalGuitarsService = classicalGuitarsService;
    }

    public void sendToDeposit(AcousticGuitar acousticGuitar) {
        ClassicalGuitar classicalGuitar = new ClassicalGuitar();
        GuitarSpecification oldGuitarSpecification = acousticGuitar.getGuitarSpecification();
        GuitarSpecification newGuitarSpec = new GuitarSpecification("nylon", oldGuitarSpecification.nrOfStrings(), oldGuitarSpecification.bodyMaterial(), oldGuitarSpecification.brand(), oldGuitarSpecification.modelName());
        classicalGuitar.setGuitarSpecification(newGuitarSpec);
        classicalGuitarsService.sendToDeposit(classicalGuitar);
    }
}
