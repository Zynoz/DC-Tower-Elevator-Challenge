package model;

import java.util.ArrayList;

public class ElevatorManagment {
    private ArrayList<Elevator> elevators = new ArrayList<>(7);
    private ArrayList<Elevator> freeElevators = new ArrayList<>(7);
    private ArrayList<Request> requests = new ArrayList<>();

    public ElevatorManagment() {

    }

    /**
     * Create and add all elevators
     */
    private void setup() {
        Elevator e1 = new Elevator(1);
        Elevator e2 = new Elevator(2);
        Elevator e3 = new Elevator(3);
        Elevator e4 = new Elevator(4);
        Elevator e5 = new Elevator(5);
        Elevator e6 = new Elevator(6);
        Elevator e7 = new Elevator(7);

        elevators.add(e1);
        elevators.add(e2);
        elevators.add(e3);
        elevators.add(e4);
        elevators.add(e5);
        elevators.add(e6);
        elevators.add(e7);
    }

    public void addRequest(Request request) {
        if (request != null) {

        }
    }

}