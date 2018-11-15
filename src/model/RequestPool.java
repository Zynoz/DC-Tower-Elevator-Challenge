package model;

import java.util.ArrayList;

/**
 * This class manages all requests.
 */
public class RequestPool {
    private volatile ArrayList<Request> requests = new ArrayList<>();

    public RequestPool() {

    }

    /**
     * Checks if request is valid, not already in list and adds it to tbe request list.
     * @param request
     * @throws ElevatorException
     */
    public void add(Request request) throws ElevatorException {
        if (request != null) {
            if (!requests.contains(request)) {
                requests.add(request);
            } else {
                throw new ElevatorException("Request already in work");
            }
        } else {
            throw new ElevatorException("Request not valid");
        }
    }

    /**
     * Returns next request in list.
     * @return
     */
    public Request getNextRequest() {
        if (!requests.isEmpty()) {
            Request request = requests.get(0);
            requests.remove(request);
            return request;
        } else {
            return null;
        }
    }

    /**
     * @return true if there is at least one request available.
     */
    public boolean hasNextRequest() {
        return !requests.isEmpty();
    }
}