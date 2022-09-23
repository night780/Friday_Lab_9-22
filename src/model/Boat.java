package model;

/**
 * Boat POJO
 * Friday Lab: Using Java's PriorityQueue Class
 * @author Jacob Jonas
 * @version 1.1
 */
public class Boat implements Comparable<Boat>{

    private int registrationID;
    private String name;
    private double gallonsOfFuelRemaining;


    /**
     * @param registrationID registration number for boat (ID)
     * @param name name of boat
     * @param fuelRemaining gallons left onboard of boat
     */
    public Boat(int registrationID, String name, double fuelRemaining) {
        this.registrationID = registrationID;
        this.name = name;
        this.gallonsOfFuelRemaining = fuelRemaining;
    }

    @Override
    public int compareTo(Boat object) {
        return Double.compare(gallonsOfFuelRemaining, object.gallonsOfFuelRemaining);
    }

    /**
     * Gets the registration ID Number for Boat
     * @return registration ID of boat
     */
    public int getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets the registration ID Number for Boat
     * @param registrationID registration ID Number for Boat
     */
    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }
    /**
     * Gets the name of the boat
     * @return name of the boat
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the boat
     * @param name name of the boat
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the Gallons of fuel left in the boat
     *
     * @return gallons Of Fuel Remaining on the boat
     */
    public double getGallonsOfFuelRemaining() {
        return gallonsOfFuelRemaining;
    }

    /**
     * Sets the Gallons of fuel left in the boat
     *
     * @param fuelRemaining gallons of fuel remaining on the boat
     */
    public void setGallonsOfFuelRemaining(double fuelRemaining) {
        this.gallonsOfFuelRemaining = fuelRemaining;
    }



    @Override
    public String toString() {
        return "The " + name + " ("+registrationID+") "+"has " + getGallonsOfFuelRemaining() + " Gallons of fuel left.";
    }
}
