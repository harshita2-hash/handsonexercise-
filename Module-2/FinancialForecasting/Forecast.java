public class Forecast {



    // Recursive method to calculate future value

    double calculateFutureValue(double amount, double rate, int years) {



        // Base condition

        if(years == 0) {


            return amount;

        }



        // Recursive call

        return calculateFutureValue(amount, rate, years-1)
                *
                (1 + rate);

    }

}