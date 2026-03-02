public class PaymentProcessor {

            public void processPayment(double amount, String currency) {
                    System.out.println("Processing payment of " + amount + " " + currency);
                        }
    public void processPayment(double amount, String currency, String paymentMethod) {
System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
                                            }

     public static void main(String[] args) {
  PaymentProcessor processor = new PaymentProcessor();
   processor.processPayment(49.99, "USD");
 processor.processPayment(1299.00, "PHP", "Credit Card");
