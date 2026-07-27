public class Main {


    public static void main(String args[]) {


        Order orders[] = {


            new Order(101,"Jeni",5000),

            new Order(102,"Ravi",1500),

            new Order(103,"Anu",9000),

            new Order(104,"Kiran",3000)

        };



        SortingOperations sort = new SortingOperations();



        System.out.println("Before Sorting:");

        display(orders);



        // Bubble Sort

        sort.bubbleSort(orders);



        System.out.println("\nAfter Bubble Sort:");

        display(orders);



        Order orders2[] = {


            new Order(101,"Jeni",5000),

            new Order(102,"Ravi",1500),

            new Order(103,"Anu",9000),

            new Order(104,"Kiran",3000)

        };




        // Quick Sort

        sort.quickSort(orders2,0,orders2.length-1);



        System.out.println("\nAfter Quick Sort:");

        display(orders2);

    }





    static void display(Order orders[]) {


        for(Order o: orders) {

            o.displayOrder();

        }
    }
}