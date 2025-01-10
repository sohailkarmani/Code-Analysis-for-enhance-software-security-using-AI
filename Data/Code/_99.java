// SimpleInterest.java

public class _99 {
    public double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        _99 interestCalculator = new _99();
        double principal = 1000.0;
        double rate = 5.0;
        int time = 3;
        double interest = interestCalculator.calculateInterest(principal, rate, time);
        System.out.println("The simple interest for " + principal + " at " + rate + "% for " + time + " years is: " + interest);
    }
}
