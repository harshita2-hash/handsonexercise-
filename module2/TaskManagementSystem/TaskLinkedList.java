public class TaskLinkedList {


    Task head;



    // Add Task
    void addTask(Task task) {


        if(head == null) {

            head = task;

        }
        else {

            Task current = head;


            while(current.next != null) {

                current = current.next;

            }


            current.next = task;
        }


        System.out.println("Task Added Successfully");

    }




    // Search Task

    void searchTask(int id) {


        Task current = head;



        while(current != null) {


            if(current.taskId == id) {


                System.out.println("Task Found:");

                current.displayTask();

                return;

            }


            current = current.next;

        }


        System.out.println("Task Not Found");

    }





    // Display All Tasks

    void displayTasks() {


        Task current = head;



        while(current != null) {


            current.displayTask();


            current = current.next;

        }

    }





    // Delete Task

    void deleteTask(int id) {



        if(head == null) {

            System.out.println("List Empty");

            return;

        }



        if(head.taskId == id) {


            head = head.next;


            System.out.println("Task Deleted");

            return;

        }




        Task current = head;



        while(current.next != null) {



            if(current.next.taskId == id) {



                current.next = current.next.next;


                System.out.println("Task Deleted");


                return;

            }


            current = current.next;

        }



        System.out.println("Task Not Found");

    }

}