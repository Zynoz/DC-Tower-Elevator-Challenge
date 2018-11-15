package model;

import java.util.UUID;

/**
 * This class represents a request and stores a unique request ID, the request from and to to floor.
 */
public class Request {
    private String requestID;
    private int requestFromFloor;
    private int requestToFloor;

    public Request(int requestFromFloor, int requestToFloor) throws ElevatorException {
        requestID = UUID.randomUUID().toString();
        setRequestFromFloor(requestFromFloor);
        setRequestToFloor(requestToFloor);
    }

    /**
     * Checks if requestFromFloor is valid
     * @param requestFromFloor
     * @throws ElevatorException
     */
    public void setRequestFromFloor(int requestFromFloor) throws ElevatorException {
        if ((requestFromFloor < 0) || requestFromFloor > 55) {
            throw new ElevatorException("Invalid floor number");
        } else {
            this.requestFromFloor = requestFromFloor;
        }
    }

    /**
     * Checks if requestToFloor is valid
     * @param requestToFloor
     * @throws ElevatorException
     */
    public void setRequestToFloor(int requestToFloor) throws ElevatorException {
        if ((requestToFloor < 0) || requestToFloor > 55) {
            throw new ElevatorException("Invalid floor number");
        } else {
            this.requestToFloor = requestToFloor;
        }
    }

    public String isGoingUp() {
        return requestFromFloor > requestToFloor ? "down" : "up";
    }

    public String getRequestID() {
        return requestID;
    }

    public int getRequestFromFloor() {
        return requestFromFloor;
    }

    public int getRequestToFloor() {
        return requestToFloor;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestID='" + requestID + '\'' +
                ", requestFromFloor=" + requestFromFloor +
                ", requestToFloor=" + requestToFloor +
                '}';
    }
}