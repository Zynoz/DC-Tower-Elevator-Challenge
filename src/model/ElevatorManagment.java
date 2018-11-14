package model;

import java.util.ArrayList;

public class ElevatorManagment {
    private ElevatorPool elevatorPool = new ElevatorPool();
    private RequestPool requestPool = new RequestPool();

    public ElevatorManagment() {
        setup();
    }

    /**
     * Create all elevators and add them to freeElevators
     */
    private void setup() {

    }


    /**
     * This method takes in a request and adds it to the request list
     * @param request request to add
     * @throws ElevatorException
     */
    public void addRequest(Request request) throws ElevatorException {
        requestPool.add(request);
    }

    /**
     * This method creates a new thread that runs through the elevator-procedure
     */
    private synchronized void workRequest() {
//        Thread thread = new Thread(() -> {
//            if ((freeElevators.get(0) != null) && (requestPool.size() >= 1)) {
//                Elevator elevator = freeElevators.get(0);
//                Request request = requestPool.get(0);
//
//                elevatorsInUse.add(elevator);
//
//                elevator.setCurrentRequest(requestPool.get(0));
//
//                freeElevators.remove(elevator);
//                requestPool.remove(request);
//
//                System.out.println("Elevator " + elevator.getElevatorID() + " is going from floor " + elevator.getCurrentRequest().getRequestFromFloor() + " to floor " + elevator.getCurrentRequest().getRequestToFloor() + "; Direction: " + elevator.getCurrentRequest().isGoingUp());
//                System.out.println();
//                System.out.println("elevatorsInUse: " + elevatorsInUse.size());
//                System.out.println("freeElevators: " + freeElevators.size());
//                System.out.println();
//
//                //Time it takes the elevator to fulfil the request
//                try {
//                    Thread.sleep(elevator.getDelay());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                elevator.setCurrentFloor(request.getRequestToFloor());
//                System.out.println("Elevator " + elevator.getElevatorID() + " arrived on floor " + elevator.getCurrentFloor());
//            }
//        });
//        thread.start();
    }
}