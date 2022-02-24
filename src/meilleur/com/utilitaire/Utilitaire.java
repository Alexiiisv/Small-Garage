package meilleur.com.utilitaire;

import meilleur.com.model.Car;

import java.util.HashMap;
import java.util.Map;

public class Utilitaire {

    HashMap<Integer, Car> hmcars = new HashMap<>();

    public void garage() {
        Car c1 = new Car(4, "BMW");
        Car c2 = new Car(4, "Citroen");
        Car c3 = new Car(4, "Audi");

        addCarToGarage(c1);
        addCarToGarage(c2);
        addCarToGarage(c3);

        allMyCars();
    }

    private void allMyCars() {
        System.out.println("Regarde toutes mes voitures !\n");
        for (Map.Entry<Integer, Car> c : hmcars.entrySet()) {
            System.out.println(c.getValue().toString());
        }
    }

    private void addCarToGarage(Car voiture) {
        hmcars.put(hmcars.size()+1, voiture);
    }
}
