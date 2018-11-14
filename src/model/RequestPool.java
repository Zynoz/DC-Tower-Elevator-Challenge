package model;

import java.util.ArrayList;

public class RequestPool {
    private ArrayList<Request> requests = new ArrayList<>();

    public RequestPool() {

    }

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

    public Request getNextRequest() {
        if (!requests.isEmpty()) {
            Request request = requests.get(0);
            requests.remove(request);
            return request;
        } else {
            return null;
        }
    }

    public boolean hasNextRequest() {
        return !requests.isEmpty();
    }
}