package test;

import model.ElevatorException;
import model.ElevatorManagment;
import model.Request;

public class Main {
    public static void main(String[] args) {
        ElevatorManagment elevatorManagment = new ElevatorManagment();

        try {
            Request r1 = new Request(0, 10);
            Request r2 = new Request(10, 0);
            Request r3= new Request(5, 50);
            Request r4 = new Request(4, 35);

            elevatorManagment.addRequest(r1);
            elevatorManagment.addRequest(r2);
            elevatorManagment.addRequest(r3);
            elevatorManagment.addRequest(r4);

        } catch (ElevatorException e) {
            System.out.println(e.getMessage());
        }


    }
}