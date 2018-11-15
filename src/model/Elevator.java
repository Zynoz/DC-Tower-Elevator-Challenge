package model;

/**
 * This class represents an elevators.
 */
public class Elevator {
    private int elevatorID;
    private int currentFloor;
    private int goingTo;
    private Request currentRequest;
    private boolean inUse;

    public Elevator(int elevatorID) {
        this.elevatorID = elevatorID;
        currentFloor = 0;
    }

    public void setCurrentFloor() {
        this.currentFloor = currentRequest.getRequestToFloor();
    }

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
     * Checks if given request is valid
     * @param request
     */
    public void setCurrentRequest(Request request)  {
        if (request != null) {
            this.currentRequest = request;
            goingTo = currentRequest.getRequestToFloor();
            currentFloor = currentRequest.getRequestFromFloor();
        } else {
            System.out.println("Request not valid");
        }
    }

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
     * @return duration in milliseconds
     */
    public int getDelay() {
        return Math.abs(currentRequest.getRequestToFloor() - currentRequest.getRequestFromFloor()) * 1000;
    }

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