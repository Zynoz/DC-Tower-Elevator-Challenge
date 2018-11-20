package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Maximilian Moser
 * This class manages all requests.
 */
@SuppressWarnings("WeakerAccess")
public class RequestPool {
    private final List<Request> requests = Collections.synchronizedList(new ArrayList<>());

    public RequestPool() {

    }

    /**
     * Checks if request is valid, not already in requests and adds it to tbe request requests.
     * @param request Request to add to RequestPool.
     * @throws ElevatorException
     */
    public synchronized void add(Request request) throws ElevatorException {
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
     * Checks if there is a next request.
     * If there is one, it gets removed from the requests and returned.
     * If there is no next request, null is returned
     * @return Returns next request in requests.
     */
    public synchronized Request getNextRequest() {
        if (!requests.isEmpty()) {
            Request request = requests.get(0);
            requests.remove(request);
            return request;
        } else {
            return null;
        }
    }

    /**
     * @return Returns true if there is at least one request available.
     */
    public synchronized boolean hasNextRequest() {
        return !requests.isEmpty();
    }
}