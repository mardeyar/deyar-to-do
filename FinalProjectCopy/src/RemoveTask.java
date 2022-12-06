import java.util.Scanner;

public class RemoveTask {
    Scanner taskDone = new Scanner(System.in);
    public void taskRemove(Tasks task) {

        DisplayTasks taskDisplay = new DisplayTasks();
        taskDisplay.taskDisplay(task);

            System.out.println();
            System.out.print("Please select the TaskID you want to remove: ");
            int taskNum = taskDone.nextInt() - 1;
            try {
                task.taskList.remove(taskNum);
                task.taskDue.remove(taskNum);
                task.taskDesc.remove(taskNum);
                task.taskStat.remove(taskNum);
                System.out.println("Task was successfully removed from your list");
                System.out.println("---------------------------------------------------------------------------------------------------------");
            } catch (Exception a) {
                System.out.println("TaskID doesn't exist: Exiting to main menu...");
                System.out.println("---------------------------------------------------------------------------------------------------------");
            }
    }
}
