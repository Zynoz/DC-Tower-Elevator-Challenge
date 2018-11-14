package model;

import java.util.UUID;

public class RequestNew {
    private String requestID;
    private int requestFrom;
    private int requestTo;

    public RequestNew(int request) {
        requestID = UUID.randomUUID().toString();

    }


}