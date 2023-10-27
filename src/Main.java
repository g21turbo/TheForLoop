public class Main {

    public static void main(String[] args) {

        //initialization; expression; increment
        for (int counter = 1; counter <= 25; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(1000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}