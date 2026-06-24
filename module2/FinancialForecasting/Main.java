public class Main {


    public static void main(String args[]) {



        Forecast forecast = new Forecast();



        double initialAmount = 10000;


        double growthRate = 0.10; 
        // 10% growth


        int years = 5;




        double futureValue =
        forecast.calculateFutureValue(
            initialAmount,
            growthRate,
            years
        );




        System.out.println(
            "Predicted Future Value: "
            + futureValue
        );

    }
}