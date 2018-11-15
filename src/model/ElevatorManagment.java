package model;

public class ElevatorManagment {
    private ElevatorPool elevatorPool = new ElevatorPool();
    private RequestPool requestPool = new RequestPool();

    public ElevatorManagment() {
        start();
    }

    public void start() {
        Thread thread = new Thread(() -> {
            while (true) {
                workRequest();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
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
    //TODO fix current floor!
    private synchronized void workRequest() {
        Thread thread = new Thread(() -> {
            if (elevatorPool.hasFreeElevator() && requestPool.hasNextRequest()) {
                Elevator elevator = elevatorPool.getFreeElevator();
                Request request = requestPool.getNextRequest();
                elevator.setCurrentRequest(request);
                System.out.println("Elevator " + elevator.getElevatorID() + ": current floor: " + elevator.getCurrentFloor() + ", destination floor: " + elevator.getGoingTo() + " direction: " + elevator.isGoingUp());

                //Time it takes the elevator to fulfil the request
                try {
                    Thread.sleep(elevator.getDelay());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                elevator.setCurrentFloor();
                elevatorPool.returnElevator(elevator);
                System.out.println("Elevator " + elevator.getElevatorID() + " is now done with " + elevator.getCurrentRequest().getRequestID() + " and on floor " + elevator.getCurrentFloor());
            }
        });
        thread.start();
    }
}