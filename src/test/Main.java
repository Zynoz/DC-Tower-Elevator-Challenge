package test;

import model.ElevatorException;
import model.ElevatorManagment;
import model.Request;

public class Main {
    public static void main(String[] args) {
        ElevatorManagment elevatorManagment = new ElevatorManagment();

        try {
            Request r1 = new Request(0, 1);
            Request r2 = new Request(2, 3);
            Request r3= new Request(4, 6);
            Request r4 = new Request(7, 5);
            Request r5 = new Request(30, 0);
            Request r6 = new Request(23, 6);
            Request r7= new Request(5, 50);
            Request r8 = new Request(45, 35);


            elevatorManagment.addRequest(r1);
            elevatorManagment.addRequest(r2);
            elevatorManagment.addRequest(r3);
            elevatorManagment.addRequest(r4);
            elevatorManagment.addRequest(r5);
            elevatorManagment.addRequest(r6);
            elevatorManagment.addRequest(r7);
            elevatorManagment.addRequest(r8);

            elevatorManagment.start();
        } catch (ElevatorException e) {
            System.out.println(e.getMessage());
        }


    }
}