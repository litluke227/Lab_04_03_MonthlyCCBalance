//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double balanceCC = 5000;
        final double interest = 0.17;
        double fMonth = (balanceCC * interest) + balanceCC;
        System.out.println("The first month's interest is: "+ fMonth);
        double sMonth = (fMonth * interest) + balanceCC;
        System.out.println("The second month's interest is: "+ sMonth);

    }
}