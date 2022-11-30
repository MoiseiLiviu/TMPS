package lab_2.service;

import lab_2.domain.models.guitar.ElectricGuitar;
import lab_2.domain.models.guitar.Guitar;
import lab_2.domain.models.guitar.GuitarSpecification;

public class GuitarService {

    private static GuitarService instance;

    private GuitarService(){

    }

    public static synchronized GuitarService getInstance(){
        if(instance == null){
            instance = new GuitarService();
        }
        return instance;
    }

    public void createGuitars(int nrOfGuitars, GuitarSpecification guitarSpecification){
        for(int i = 0; i<nrOfGuitars; i++){
            Guitar guitar = new ElectricGuitar();
            guitar.setGuitarSpecification(guitarSpecification);
        }
    }
}
