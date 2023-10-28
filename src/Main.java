public class Main {

    public static void main(String[] args) {

        //initialization; expression; increment
        for (int counter = 1; counter <= 25; counter++) {
            System.out.println(counter);
        }

        System.out.println();

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        System.out.println();

        for (double rate = 7.5; rate <= 10.0; rate+=.25) {
            double interestAmount = calculateInterest(100.00, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 at " + rate + "% interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}