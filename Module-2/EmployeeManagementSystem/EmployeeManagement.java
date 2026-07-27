public class EmployeeManagement {


    Employee employees[] = new Employee[10];

    int count = 0;



    // Add Employee
    void addEmployee(Employee employee) {


        if(count < employees.length) {

            employees[count] = employee;

            count++;

            System.out.println("Employee Added Successfully");

        }
        else {

            System.out.println("Array is Full");

        }

    }




    // Search Employee
    void searchEmployee(int id) {


        for(int i=0;i<count;i++) {


            if(employees[i].employeeId == id) {


                System.out.println("Employee Found:");

                employees[i].displayEmployee();

                return;

            }
        }


        System.out.println("Employee Not Found");

    }





    // Display Employees
    void displayEmployees() {


        for(int i=0;i<count;i++) {


            employees[i].displayEmployee();

        }

    }





    // Delete Employee
    void deleteEmployee(int id) {



        for(int i=0;i<count;i++) {


            if(employees[i].employeeId == id) {



                for(int j=i;j<count-1;j++) {


                    employees[j] = employees[j+1];

                }



                count--;


                System.out.println("Employee Deleted");

                return;
            }

        }


        System.out.println("Employee Not Found");

    }

}