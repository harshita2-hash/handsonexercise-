public class Task {

    int taskId;
    String taskName;
    String status;

    Task next;   // stores address of next task


    public Task(int taskId, String taskName, String status) {

        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }


    void displayTask() {

        System.out.println(
            "Task ID: " + taskId +
            " Task Name: " + taskName +
            " Status: " + status
        );
    }
}