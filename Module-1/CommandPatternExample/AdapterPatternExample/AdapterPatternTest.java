public class AdapterPatternTest {

    public static void main(String[] args) {

        // PayPal Payment
        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        paypal.processPayment(5000);

        // Stripe Payment
        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        stripe.processPayment(7500);
    }
}