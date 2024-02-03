public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int time = 1; // на солько лет берется кредит
        int sum = 1_000_000; //сумма кредита
        double procent = 9.99; // процентная ставка
        double plateg = service.calculate(time, sum, procent);
        System.out.println(plateg);
    }
}
