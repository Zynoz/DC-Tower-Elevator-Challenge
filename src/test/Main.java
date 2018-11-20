package test;

import model.ElevatorException;
import model.ElevatorManagement;
import model.Request;

/**
 * @author Maximilian Moser
 * This class is for testing the application.
 */
public class Main {
    /**
     * First an ElevatorManagement object is created.
     * Then a shutdown hook is added to shut down the program gracefully.
     * In a try-catch-block the requests are created and added to the ElevatorManagement object.
     * The try-catch-block is for catching any exceptions that could be thrown by the program.
     * @param args
     */
    public static void main(String[] args) {
        ElevatorManagement elevatorManagement = new ElevatorManagement();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            elevatorManagement.setState(false);
            System.out.println("Application terminated successfully.");
        }));

        elevatorManagement.setState(true);
        elevatorManagement.start();

        try {

            elevatorManagement.addRequest(new Request(1,1, 5));
            elevatorManagement.addRequest(new Request(2,2, 30));
            elevatorManagement.addRequest(new Request(3, 4, 6));
            elevatorManagement.addRequest(new Request(4, 7, 5));
            elevatorManagement.addRequest(new Request(5,30, 0));
            elevatorManagement.addRequest(new Request(6, 23, 6));
            elevatorManagement.addRequest(new Request(7, 5, 50));
            elevatorManagement.addRequest(new Request(8, 45, 35));
            elevatorManagement.addRequest(new Request(9, 1, 5));
            elevatorManagement.addRequest(new Request(10, 2, 30));
            elevatorManagement.addRequest(new Request(11, 4, 6));
            elevatorManagement.addRequest(new Request(12, 7, 5));
            elevatorManagement.addRequest(new Request(13, 30, 0));
            elevatorManagement.addRequest(new Request(14, 23, 6));
            elevatorManagement.addRequest(new Request(15, 5, 50));
            elevatorManagement.addRequest(new Request(16, 45, 35));
            elevatorManagement.addRequest(new Request(17, 1, 5));
            elevatorManagement.addRequest(new Request(18, 2, 30));
            elevatorManagement.addRequest(new Request(19, 4, 6));
            elevatorManagement.addRequest(new Request(20, 7, 5));
            elevatorManagement.addRequest(new Request(21, 30, 0));
            elevatorManagement.addRequest(new Request(22, 23, 6));
            elevatorManagement.addRequest(new Request(23, 5, 50));
            elevatorManagement.addRequest(new Request(24, 45, 35));
            elevatorManagement.addRequest(new Request(25, 1, 5));
            elevatorManagement.addRequest(new Request(26, 2, 30));
            elevatorManagement.addRequest(new Request(27, 4, 6));
            elevatorManagement.addRequest(new Request(28, 7, 5));
            elevatorManagement.addRequest(new Request(29, 30, 0));
            elevatorManagement.addRequest(new Request(30, 23, 6));
            elevatorManagement.addRequest(new Request(31, 5, 50));
            elevatorManagement.addRequest(new Request(32, 45, 35));


        } catch (ElevatorException e) {
            System.out.println(e.getMessage());
        }
    }
}