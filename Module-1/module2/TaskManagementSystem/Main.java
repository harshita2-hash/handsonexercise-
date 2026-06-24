public class Main {


    public static void main(String args[]) {


        TaskLinkedList list = new TaskLinkedList();



        list.addTask(
            new Task(101,"Design UI","Pending")
        );


        list.addTask(
            new Task(102,"Database Setup","Completed")
        );


        list.addTask(
            new Task(103,"Testing","In Progress")
        );




        System.out.println("\nAll Tasks:");

        list.displayTasks();





        System.out.println("\nSearching Task:");

        list.searchTask(102);






        list.deleteTask(101);





        System.out.println("\nAfter Delete:");

        list.displayTasks();


    }
}