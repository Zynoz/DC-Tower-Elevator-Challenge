package model;

public class Elevator {
    private int elevatorID;
    private int currentFloor;
    private int goingTo;
    private Request currentRequest;
    private int delay;

    public Elevator(int elevatorID) {
        this.elevatorID = elevatorID;
        setCurrentFloor(0);
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
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
        return goingTo;
    }

    public void setCurrentRequest(Request request) {
        this.currentRequest = request;
    }

    public Request getCurrentRequest() {
        return currentRequest;
    }

    public int getDelay() {
        return Math.abs(currentRequest.getRequestToFloor() - currentRequest.getRequestFromFloor()) * 1000;
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