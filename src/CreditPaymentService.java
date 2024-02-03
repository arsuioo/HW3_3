public class CreditPaymentService {
    public double calculate(int time, int sum, double procent) {
        int month = time * 12; // кол-во платежей
        double stavka = procent / 100 / 12;//ежемесячная процентная ставка
        double anuent = (stavka + (stavka) / (Math.pow(1 + stavka, month) - 1));
        double result = sum * anuent;
        return result;
    }
}

