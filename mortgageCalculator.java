public class mortgageCalculator {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Principal (in $): ");
        float p = input.nextFloat();
        System.out.print("Enter your monthly interest rate: ");
        float r = input.nextFloat();
        System.out.print("Enter your number of payments (the number of months you will be paying the loan): ");
        int n = input.nextInt();
        if (r == 0) {
            float m1 = (p / 12);
            String MortgageFormatted1 = NumberFormat.getCurrencyInstance().format(m1);
            System.out.println("Monthly Payment: " + MortgageFormatted1);
        }
        else {
            float m2 = (float) ((p * r * (Math.pow(1 + r, n))) / ((Math.pow(1 + r, n)) - 1));
            String MortgageFormatted2 = NumberFormat.getCurrencyInstance().format(m2);
            System.out.println("Monthly Payment: " + MortgageFormatted2);
        }
  }
}
