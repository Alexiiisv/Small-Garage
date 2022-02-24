package meilleur.com.model;

public class Car extends Vehicule {

    public int getNbWheels() {
        return nbWheels;
    }

    public void setNbWheels(int nbWheels) {
        this.nbWheels = nbWheels;
    }

    public String toString() {
        if (this.getModel().equals("Audi")) {
            return "Mon " + this.getModel() + " à " + this.getNbWheels() + " roues";
        }
        return "M'as " + this.getModel() + " à " + this.getNbWheels() + " roues";
    }

    public boolean equals(Car c) {
        return this.getModel().equals(c.getModel()) && this.getNbWheels() == c.getNbWheels();
    }

    private int nbWheels;

    /**
     * créer une voiture
     */
    public Car(int nbWheels, String model) {
        super(model);
        this.nbWheels = nbWheels;
    }

}
