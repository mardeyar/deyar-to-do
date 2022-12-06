import java.util.Scanner;

public class CompletedTasks  {
    Scanner taskDone = new Scanner(System.in);
    public void doneTask(Tasks task) {

        DisplayTasks taskDisplay = new DisplayTasks();
        taskDisplay.taskDisplay(task);

        System.out.println();

        try {

            System.out.print("Select the TaskID you want to mark as completed: ");
            int taskNum = taskDone.nextInt();
            task.taskStat.set(taskNum - 1, "Complete");
            System.out.println("---------------------------------------------------------------------------------------------------------");
        } catch (Exception a) {
            System.out.println("TaskID does not exist. Exiting to main menu...");
            System.out.println("---------------------------------------------------------------------------------------------------------");
        }
    }
}
