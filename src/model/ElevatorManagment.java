package model;

/**
 * A class that manages all elevators.
 */
public class ElevatorManagment {
    private final ElevatorPool elevatorPool = new ElevatorPool();
    private final RequestPool requestPool = new RequestPool();

    /**
     * Default constructor which immediately calls the {@code start()} method.
     * @see ElevatorManagment#start()
     */
    public ElevatorManagment() {
        start();
    }

    /**
     * In this method an infinite while loop calls the {@code workRequest()} method with a delay of one second.
     * @see ElevatorManagment#workRequest()
     */
    private void start() {
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
     * This method takes in a {@code Request} and adds it to the request list.
     * @param request Request to be added.
     * @throws ElevatorException An ElevatorException is thrown when there is an error adding this request.
     * @see Request
     * @see RequestPool#add(Request)
     */
    public void addRequest(Request request) throws ElevatorException {
        requestPool.add(request);
    }

    /**
     * This method creates a new thread that runs through the elevator-procedure.
     * If the {@code ElevatorPool} has a free elevator and the {@code RequestPool} has a new {@code Request} available, this request is assigned to the next free {@code Elevator} object.<br>
     * Then this thread is paused for the delay it takes the elevator to reach the floor it is going to.<br>
     * After that, the elevator's current floor is set to the destination floor of the request.<br>
     * When the request is done, the elevator is 'returned' to the list of free elevators.<br>
     * Finally the elevator id, the request number and the current floor number are printed to the command line.
     * @see ElevatorPool
     * @see ElevatorPool#returnElevator(Elevator)
     * @see ElevatorPool#getFreeElevator(Request)
     * @see ElevatorPool#hasFreeElevator()
     * @see RequestPool
     * @see RequestPool#hasNextRequest()
     * @see RequestPool#getNextRequest()
     * @see Elevator
     * @see Request
     */
    private synchronized void workRequest() {
        Thread thread = new Thread(() -> {
            if (elevatorPool.hasFreeElevator() && requestPool.hasNextRequest()) {
                Request request = requestPool.getNextRequest();
                Elevator elevator = elevatorPool.getFreeElevator(request);
                System.out.println("Elevator " + elevator.getElevatorID() + ": current floor: " + elevator.getCurrentFloor() + ", destination floor: " + elevator.getGoingTo() + " direction: " + elevator.isGoingUp());

                //Time it takes the elevator to fulfil the request
                try {
                    Thread.sleep(elevator.getDelay());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                elevator.setCurrentFloor();
                elevatorPool.returnElevator(elevator);
                System.out.println("Elevator " + elevator.getElevatorID() + " is now done with request number " + elevator.getCurrentRequest().getRequestNumber() + " and on floor " + elevator.getCurrentFloor());
            }
        });
        thread.start();
    }
}