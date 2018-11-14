package model;

import java.util.UUID;

public class Request {
    private String requestID;
    private int requestFromFloor;
    private int requestToFloor;

    public Request(int requestFromFloor, int requestToFloor) throws ElevatorException {
        requestID = UUID.randomUUID().toString();
        setRequestFromFloor(requestFromFloor);
        setRequestToFloor(requestToFloor);
    }

    public void setRequestFromFloor(int requestFromFloor) throws ElevatorException {
        if ((requestFromFloor <= 0) || requestFromFloor >= 50) {
            throw new ElevatorException("No floor with this number");
        } else {
            this.requestFromFloor = requestFromFloor;
        }
    }

    public void setRequestToFloor(int requestToFloor) throws ElevatorException {
        if ((requestToFloor <= 0) || requestToFloor >= 50) {
            throw new ElevatorException("No floor with this number");
        } else {
            this.requestToFloor = requestToFloor;
        }
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