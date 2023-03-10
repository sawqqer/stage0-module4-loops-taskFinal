package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint <= 0) {
            System.out.println("Invalid input. Number must be a positive integer.");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            int product = numberTableToPrint * i;
            System.out.println(numberTableToPrint + " x " + i + " = " + product);
        }
    }
}
