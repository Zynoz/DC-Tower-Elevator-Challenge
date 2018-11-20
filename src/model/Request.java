package model;

import java.util.UUID;

/**
 * @author Maximilian Moser
 * This class represents a request and stores a unique request ID, the request from and to to floor.
 */
@SuppressWarnings("WeakerAccess")
public class Request {
    private String requestID;
    private int requestFromFloor;
    private int requestToFloor;
    private int requestNumber;

    /**
     * Constructor for a new request.
     * The requestID is generated with the UUID class.
     * @param requestNumber for identifying the request.
     * @param requestFromFloor the floor from where the request is coming.
     * @param requestToFloor the floor to where the request is going
     * @throws ElevatorException
     * @see UUID
     */
    public Request(int requestNumber, int requestFromFloor, int requestToFloor) throws ElevatorException {
        requestID = UUID.randomUUID().toString();
        this.requestNumber = requestNumber;
        setRequestFromFloor(requestFromFloor);
        setRequestToFloor(requestToFloor);
    }

    /**
     * Checks if requestFromFloor is valid.
     * @param requestFromFloor floor where the request is coming from.
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
     * Checks if requestToFloor is valid.
     * @param requestToFloor floor from where the request is going to.
     * @throws ElevatorException
     */
    public void setRequestToFloor(int requestToFloor) throws ElevatorException {
        if ((requestToFloor < 0) || requestToFloor > 55) {
            throw new ElevatorException("Invalid floor number");
        } else {
            this.requestToFloor = requestToFloor;
        }
    }

    public int getRequestFromFloor() {
        return requestFromFloor;
    }

    public int getRequestToFloor() {
        return requestToFloor;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    /**
     * Returns a {@code String} object representing this {@code Request}.
     * @return Returns a string representation of this {@code Request}
     */
    @Override
    public String toString() {
        return "Request{" +
                "requestID='" + requestID + '\'' +
                ", requestFromFloor=" + requestFromFloor +
                ", requestToFloor=" + requestToFloor +
                '}';
    }
}