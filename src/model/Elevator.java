package model;

/**
 * @author Maximilian Moser
 * This class represents an elevators.
 */
@SuppressWarnings("WeakerAccess")
public class Elevator {
    private int elevatorID;
    private int currentFloor;
    private int goingTo;
    private Request currentRequest;
    private boolean inUse;

    /**
     * Constructor that takes in an elevatorID.
     * @param elevatorID The ID for the elevator
     */
    public Elevator(int elevatorID) {
        this.elevatorID = elevatorID;
        currentFloor = 0;
    }

    public void setCurrentFloor() {
        this.currentFloor = currentRequest.getRequestToFloor();
    }

    @SuppressWarnings("unused")
    public void setGoingTo(int goingTo) {
        this.goingTo = goingTo;
    }

    public int getElevatorID() {
        return elevatorID;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getGoingTo() {
        return currentRequest.getRequestToFloor();
    }

    /**
     * Checks if given request is valid.
     * @param request Request to bind to the elevator.
     */
    public void setCurrentRequest(Request request) {
        if (request != null) {
            this.currentRequest = request;
            goingTo = currentRequest.getRequestToFloor();
            currentFloor = currentRequest.getRequestFromFloor();
        }
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public Request getCurrentRequest() {
        return currentRequest;
    }

    /**
     * Calculates how long the elevator takes to get to the destination floor.
     * Every floor adds one second to the travel time.
     * @return Returns the duration it takes the elevator in milliseconds.
     */
    public int getDelay() {
        return Math.abs(currentRequest.getRequestToFloor() - currentRequest.getRequestFromFloor()) * 1000;
    }

    /**
     * @return Returns 'down' if the current floor is higher than the floor the elevator is going to. Otherwise it returns 'up'.
     */
    public String isGoingUp() {
        return currentFloor > goingTo ? "down" : "up";
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "elevatorID=" + elevatorID +
                ", currentFloor=" + currentFloor +
                ", goingTo=" + goingTo +
                ", currentRequest=" + currentRequest +
                '}';
    }
}