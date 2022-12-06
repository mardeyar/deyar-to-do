import java.util.Scanner;

public class EditTask {

    public void changeTask(Tasks task) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        try {
            DisplayTasks taskDisplay = new DisplayTasks();
            taskDisplay.taskDisplay(task);

            System.out.println();

            System.out.print("Enter the TaskID you want to edit: ");
            int taskNumChange = input.nextInt();
            System.out.println("What would you like to change?");
            System.out.println("1. Change task name | 2. Change task due date | 3. Change task description");
            System.out.print("Please make a selection: ");
            int taskChoice = input.nextInt();

            if (taskChoice == 1) {
                System.out.print("What would you like to rename your task to?: ");
                String a = input1.nextLine();
                task.taskList.set(taskNumChange - 1, a);
            } else if (taskChoice == 2) {
                System.out.print("When is your new task date? Please use the format YYYY-MM-DD: ");
                String b = input1.nextLine();
                task.taskDue.set(taskNumChange - 1, b);
            } else if (taskChoice == 3) {
                System.out.print("Please enter a new description of your task: ");
                String c = input1.nextLine();
                task.taskDesc.set(taskNumChange - 1, c);
            }

            System.out.println("---------------------------------------------------------------------------------------------------------");

            } catch(Exception e) {
            System.out.println("Something went wrong: Please try again");
            System.out.println("---------------------------------------------------------------------------------------------------------");
        }
    }
}