import java.util.Scanner;

public class AddingTasks {
    Scanner userTask = new Scanner(System.in);
    Scanner add = new Scanner(System.in);

    //Ask user details about their task to store in arraylists
    public void addTask(Tasks task) {
        System.out.print("How many tasks would you like to add?: ");

        int numTasks = add.nextInt();
        for (int i = 0; i < numTasks; i++) {
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.print("Which task would you like to add?: ");
            task.taskList.add(userTask.nextLine());
            System.out.print("When is this task due? Use YYYY-MM-DD format: ");
            task.taskDue.add(userTask.nextLine());
            task.taskStat.add("Incomplete");
            System.out.print("Provide a description for the task: ");
            task.taskDesc.add(userTask.nextLine());
        }
    }
}
