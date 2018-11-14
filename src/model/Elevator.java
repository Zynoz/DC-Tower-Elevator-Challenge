package model;

public class Elevator {
    private int elevatorID;
    private int currentFloor;
    private int goingTo;
    private boolean directionUp;

    public Elevator(int elevatorID) {
        this.elevatorID = elevatorID;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setGoingTo(int goingTo) {
        this.goingTo = goingTo;
    }

    public void setDirectionUp(boolean directionUp) {
        this.directionUp = directionUp;
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

    public boolean isDirectionUp() {
        return directionUp;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "elevatorID=" + elevatorID +
                ", currentFloor=" + currentFloor +
                ", goingTo=" + goingTo +
                ", directionUp=" + directionUp +
                '}';
    }
}