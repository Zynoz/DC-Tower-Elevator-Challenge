package model;

import java.util.ArrayList;

public class ElevatorPool {
    private ArrayList<Elevator> freeElevators = new ArrayList<>();
    private ArrayList<Elevator> inUseElevators = new ArrayList<>();

    public ElevatorPool() {
        Elevator e1 = new Elevator(1);
        Elevator e2 = new Elevator(2);
        Elevator e3 = new Elevator(3);
        Elevator e4 = new Elevator(4);
        Elevator e5 = new Elevator(5);
        Elevator e6 = new Elevator(6);
        Elevator e7 = new Elevator(7);

        freeElevators.add(e1);
        freeElevators.add(e2);
        freeElevators.add(e3);
        freeElevators.add(e4);
        freeElevators.add(e5);
        freeElevators.add(e6);
        freeElevators.add(e7);
    }

    public Elevator getFreeElevator() {
        if (freeElevators.get(0) != null) {
            Elevator free = freeElevators.get(0);
            freeElevators.remove(free);
            inUseElevators.add(free);
            return free;
        } else {
            return null;
        }
    }

    public void returnElevator(Elevator elevator) {

    }

}