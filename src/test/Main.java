package test;

import model.ElevatorException;
import model.ElevatorManagment;
import model.Request;

public class Main {
    public static void main(String[] args) {
        ElevatorManagment elevatorManagment = new ElevatorManagment();

        try {
            elevatorManagment.addRequest(new Request(1,1, 5));
            elevatorManagment.addRequest(new Request(2,2, 30));
            elevatorManagment.addRequest(new Request(3, 4, 6));
            elevatorManagment.addRequest(new Request(4, 7, 5));
            elevatorManagment.addRequest(new Request(5,30, 0));
            elevatorManagment.addRequest(new Request(6, 23, 6));
            elevatorManagment.addRequest(new Request(7, 5, 50));
            elevatorManagment.addRequest(new Request(8, 45, 35));
            elevatorManagment.addRequest(new Request(9, 1, 5));
            elevatorManagment.addRequest(new Request(10, 2, 30));
            elevatorManagment.addRequest(new Request(11, 4, 6));
            elevatorManagment.addRequest(new Request(12, 7, 5));
            elevatorManagment.addRequest(new Request(13, 30, 0));
            elevatorManagment.addRequest(new Request(14, 23, 6));
            elevatorManagment.addRequest(new Request(15, 5, 50));
            elevatorManagment.addRequest(new Request(16, 45, 35));
            elevatorManagment.addRequest(new Request(17, 1, 5));
            elevatorManagment.addRequest(new Request(18, 2, 30));
            elevatorManagment.addRequest(new Request(19, 4, 6));
            elevatorManagment.addRequest(new Request(20, 7, 5));
            elevatorManagment.addRequest(new Request(21, 30, 0));
            elevatorManagment.addRequest(new Request(22, 23, 6));
            elevatorManagment.addRequest(new Request(23, 5, 50));
            elevatorManagment.addRequest(new Request(24, 45, 35));
            elevatorManagment.addRequest(new Request(25, 1, 5));
            elevatorManagment.addRequest(new Request(26, 2, 30));
            elevatorManagment.addRequest(new Request(27, 4, 6));
            elevatorManagment.addRequest(new Request(28, 7, 5));
            elevatorManagment.addRequest(new Request(29, 30, 0));
            elevatorManagment.addRequest(new Request(30, 23, 6));
            elevatorManagment.addRequest(new Request(31, 5, 50));
            elevatorManagment.addRequest(new Request(32, 45, 35));
        } catch (ElevatorException e) {
            System.out.println(e.getMessage());
        }
    }
}