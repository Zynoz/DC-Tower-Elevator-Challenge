package model;

import java.util.ArrayList;

public class ElevatorPool {
    private volatile ArrayList<Elevator> elevators = new ArrayList<>(7);

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

    public synchronized Elevator getFreeElevator() {
        for (Elevator e : elevators) {
            if (!e.isInUse()) {
                e.setInUse(true);
                System.out.println("Elevator " + e.getElevatorID() + " in use now");
                return e;
            }
        }
        return null;
    }

    public synchronized boolean hasFreeElevator() {
        for (Elevator e : elevators) {
            if (!e.isInUse()) {
                return true;
            }
        }
        return false;
    }

    public void returnElevator(Elevator elevator) {
        elevator.setInUse(false);
//        System.out.println("Elevator " + elevator.getElevatorID() + " is free again");
    }
}