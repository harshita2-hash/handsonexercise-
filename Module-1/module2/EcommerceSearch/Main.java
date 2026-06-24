public class Main {


    public static void main(String args[]) {


        Product products[] = {


            new Product(101,"Laptop","Electronics"),

            new Product(102,"Mobile","Electronics"),

            new Product(103,"Shoes","Fashion"),

            new Product(104,"Watch","Accessories"),

            new Product(105,"Book","Education")

        };



        SearchOperations search = new SearchOperations();



        System.out.println("Linear Search Result:");

        Product result1 = search.linearSearch(products,104);



        if(result1!=null)

            result1.displayProduct();

        else

            System.out.println("Product Not Found");





        System.out.println("\nBinary Search Result:");

        Product result2 = search.binarySearch(products,105);



        if(result2!=null)

            result2.displayProduct();

        else

            System.out.println("Product Not Found");


    }
}