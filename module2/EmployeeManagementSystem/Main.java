public class Main {


    public static void main(String args[]) {


        EmployeeManagement management = new EmployeeManagement();



        management.addEmployee(
            new Employee(101,"Jeni","Developer",60000)
        );


        management.addEmployee(
            new Employee(102,"Ravi","Tester",40000)
        );


        management.addEmployee(
            new Employee(103,"Anu","Manager",80000)
        );




        System.out.println("\nEmployee Records:");

        management.displayEmployees();




        System.out.println("\nSearching Employee:");

        management.searchEmployee(102);




        management.deleteEmployee(101);




        System.out.println("\nAfter Delete:");

        management.displayEmployees();


    }
}