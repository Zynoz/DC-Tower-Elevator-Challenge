package test;

import model.ElevatorException;
import model.ElevatorManagment;
import model.Request;

public class Main {
    public static void main(String[] args) {
        ElevatorManagment elevatorManagment = new ElevatorManagment();

        try {
            elevatorManagment.addRequest(null);
            elevatorManagment.addRequest(new Request(-1, 4));
            elevatorManagment.addRequest(new Request(5, 60));
            elevatorManagment.addRequest(new Request(1, 5));
            elevatorManagment.addRequest(new Request(2, 30));
            elevatorManagment.addRequest(new Request(4, 6));
            elevatorManagment.addRequest(new Request(7, 5));
            elevatorManagment.addRequest(new Request(30, 0));
            elevatorManagment.addRequest(new Request(23, 6));
            elevatorManagment.addRequest(new Request(5, 50));
            elevatorManagment.addRequest(new Request(45, 35));
            elevatorManagment.addRequest(new Request(1, 5));
            elevatorManagment.addRequest(new Request(2, 30));
            elevatorManagment.addRequest(new Request(4, 6));
            elevatorManagment.addRequest(new Request(7, 5));
            elevatorManagment.addRequest(new Request(30, 0));
            elevatorManagment.addRequest(new Request(23, 6));
            elevatorManagment.addRequest(new Request(5, 50));
            elevatorManagment.addRequest(new Request(45, 35));
            elevatorManagment.addRequest(new Request(1, 5));
            elevatorManagment.addRequest(new Request(2, 30));
            elevatorManagment.addRequest(new Request(4, 6));
            elevatorManagment.addRequest(new Request(7, 5));
            elevatorManagment.addRequest(new Request(30, 0));
            elevatorManagment.addRequest(new Request(23, 6));
            elevatorManagment.addRequest(new Request(5, 50));
            elevatorManagment.addRequest(new Request(45, 35));
            elevatorManagment.addRequest(new Request(1, 5));
            elevatorManagment.addRequest(new Request(2, 30));
            elevatorManagment.addRequest(new Request(4, 6));
            elevatorManagment.addRequest(new Request(7, 5));
            elevatorManagment.addRequest(new Request(30, 0));
            elevatorManagment.addRequest(new Request(23, 6));
            elevatorManagment.addRequest(new Request(5, 50));
            elevatorManagment.addRequest(new Request(45, 35));
        } catch (ElevatorException e) {
            System.out.println(e.getMessage());
        }
    }
}