package model;

import java.util.ArrayList;

public class ElevatorManagment {
    private ArrayList<Elevator> elevatorsInUse = new ArrayList<>(7);
    private ArrayList<Elevator> freeElevators = new ArrayList<>(7);
    private ArrayList<Request> requests = new ArrayList<>();

    public ElevatorManagment() {
        setup();
    }

    /**
     * Create all elevators and add them to freeElevators
     */
    private void setup() {
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

    /**
     * This method takes in a request and adds it to the request list
     * @param request request to add
     * @throws ElevatorException
     */
    public void addRequest(Request request) throws ElevatorException {
        if (request != null) {
            requests.add(request);
            System.out.println("request added");
            workRequest();
        } else {
            throw new ElevatorException("Request not valid");
        }
    }

    /**
     * This method creates a new thread that runs through the elevator-procedure
     */
    private void workRequest() {
        Thread t = new Thread(() -> {
            if ((freeElevators.size() >= 1) && (requests.size() >= 1)) {
                Elevator elevator = freeElevators.get(0);
                Request request = requests.get(0);

                elevatorsInUse.add(elevator);

                elevator.setCurrentRequest(requests.get(0));

                freeElevators.remove(elevator);
                requests.remove(request);

                System.out.println("Elevator " + elevator.getElevatorID() + " is going from floor " + elevator.getCurrentRequest().getRequestFromFloor() + " to floor " + elevator.getCurrentRequest().getRequestToFloor() + "; Direction: " + elevator.getCurrentRequest().isGoingUp());
                System.out.println("");
                System.out.println("elevatorsInUse: " + elevatorsInUse.size());
                System.out.println("freeElevators: " + freeElevators.size());

                //Time it takes the elevator to fulfil the request
                try {
                    Thread.sleep(elevator.getDelay());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                freeElevators.add(elevator);
                elevatorsInUse.remove(elevator);
                elevator.setCurrentFloor(request.getRequestToFloor());
                System.out.println("Elevator " + elevator.getElevatorID() + " arrived on floor " + elevator.getCurrentFloor());
            }
        });
        t.start();
    }
}