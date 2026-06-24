public class Main {


    public static void main(String args[]) {



        // Sorted according to title for binary search

        Book books[] = {


            new Book(101,"Data Structures","Mark Allen"),

            new Book(102,"Java Programming","James Gosling"),

            new Book(103,"Machine Learning","Tom Mitchell"),

            new Book(104,"Python Basics","Guido Rossum")


        };





        SearchOperations search = new SearchOperations();




        System.out.println("Linear Search Result:");



        Book result1 =
        search.linearSearch(books,"Machine Learning");




        if(result1 != null)

            result1.displayBook();


        else

            System.out.println("Book Not Found");







        System.out.println("\nBinary Search Result:");



        Book result2 =
        search.binarySearch(books,"Python Basics");




        if(result2 != null)

            result2.displayBook();


        else

            System.out.println("Book Not Found");


    }
}