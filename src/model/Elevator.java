package model;

public class Elevator {
    private int elevatorID;
    private int currentFloor;
    private int goingTo;
    private Request currentRequest;
    private int delay;
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

    public void setCurrentRequest(Request request) {
        this.currentRequest = request;
        goingTo = currentRequest.getRequestToFloor();
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