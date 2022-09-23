package test;

import model.Boat;

import java.util.*;

/**
 * Driver class that operates a dock for incoming and out going boats via a priority queue
 * @author Jacob Jonas
 * @version 2.0

 */
public class driver {

    // Max number of boats able to dock
    private static final int MAXCAPACITYDOCK = 25;

    //Number of boats docked currently
    private static int BOATSDOCKED;

    /**
     * Main method
     * @param args .
     */
    public static void main(String[] args) {

        //creating the two queues
        PriorityQueue<Boat> docked = new PriorityQueue<>();
        PriorityQueue<Boat> requesting = new PriorityQueue<>();

//        PriorityQueue<Boat> reversed = new PriorityQueue<>(Collections.reverseOrder());
//        PriorityQueue<Boat> requesting = new PriorityQueue<>(Collections.reverseOrder());

//Add boats to the docked
        requesting.add(new Boat(98973, "ssGreenRiver", 74.22));
        requesting.add(new Boat(98245, "Zephyr", 54.91));
        requesting.add(new Boat(98783, "Leviathan", 167.44));
        requesting.add(new Boat(98645, "Imagination", 15.52));
        requesting.add(new Boat(34587, "Atlantis", 37.64));
        requesting.add(new Boat(97524, "Serendipity", 42.97));

        //changes the priority of a queues element
        System.out.println(requesting.peek().getName()+" is Requesting Refueling! \nCurrent Fuel level: "+requesting.peek().getGallonsOfFuelRemaining());
        requesting.peek().setGallonsOfFuelRemaining(56.4);
        System.out.println("...");
        System.out.println("New Fuel Level: "+requesting.peek().getGallonsOfFuelRemaining());
        System.out.println("\n**\n");

        while (!requesting.isEmpty()) {
            //while requesting has entry add them to dock and then remove from requesting
            Boat firstRequest = requesting.peek();
            System.out.println("Docking " + firstRequest.getName() + " ID# " + firstRequest.getRegistrationID());
            docked.add(firstRequest);
            BOATSDOCKED++;
            requesting.remove();
        }
/**
 * Attempt reverse the queue
 */
//while (!requesting.isEmpty()){
//
//    reversed.add(requesting.peek());
//    requesting.remove();
//    requesting.add(reversed.peek());
//}

/**
 * Attempt to reverse the queue
 */

//        while (!requesting.isEmpty()) {
//            //while requesting has entry add them to dock and then remove from requesting
//            PriorityQueue<Boat> pQueue = requesting;
//             pQueue = new PriorityQueue<Boat>(Collections.reverseOrder());
//            Boat firstRequest = pQueue.peek();
//            while (!requesting.isEmpty()) {
//                requesting.remove();
//            }
//            requesting.add(firstRequest);
//            System.out.println("Docking " + firstRequest.getName() + " ID# " + firstRequest.getRegistrationID());
//            docked.add(firstRequest);
//            BOATSDOCKED++;
//            requesting.remove();
//        }



//        System.out.println("Imagination is Requesting Refueling! \nCurrent Fuel level: "+requesting.peek().getGallonsOfFuelRemaining());

        System.out.println("\n**\n");

        while (!docked.isEmpty() && BOATSDOCKED <= MAXCAPACITYDOCK) {
            //while dock is not empty it will take in the new requesting boat to dock.

            Boat boat = docked.remove();
            System.out.println(boat.getName() + "(" + boat.getRegistrationID() + ")" + " is leaving the dock now now.");
        }
    }
}
