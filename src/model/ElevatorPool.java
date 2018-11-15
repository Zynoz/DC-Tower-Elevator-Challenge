package model;

import java.util.ArrayList;

/**
 * This class manages the seven elevators.
 */
public class ElevatorPool {
    private volatile ArrayList<Elevator> elevators = new ArrayList<>(7);

    /**
     * Creates the seven elevators and adds them to the elevator list.
     */
    public ElevatorPool() {
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

    /**
     * Loops through all elevators and returns a free one.
     * @param request the request to assign to the elevator.
     * @return null if no free elevator is available.
     */
    public synchronized Elevator getFreeElevator(Request request) {
        for (Elevator e : elevators) {
            if (!e.isInUse()) {
                e.setInUse(true);
                e.setCurrentRequest(request);
                System.out.println("Elevator " + e.getElevatorID() + " in use now");
                return e;
            }
        }
        return null;
    }

    /**
     * @return true if there is at least one free elevator.
     */
    public synchronized boolean hasFreeElevator() {
        for (Elevator e : elevators) {
            if (!e.isInUse()) {
                return true;
            }
        }
        return false;
    }

    /**
     * If an elevator is done with its request, it is returned to the free list of elevators.
     * @param elevator
     */
    public void returnElevator(Elevator elevator) {
        elevator.setInUse(false);
    }
}