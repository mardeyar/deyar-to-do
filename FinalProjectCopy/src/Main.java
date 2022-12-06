import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tasks tasks = new Tasks();
        Scanner numOfTasks = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("1. Add task | 2. Mark task as done | 3. Remove task | 4. Edit task | 5. Display tasks | 6. Exit");
            System.out.print("Please make a selection: ");
            int userChoice = numOfTasks.nextInt();
            System.out.println();

            if (userChoice == 6) {
                System.out.println("See you later");
                break;
            }

            switch (userChoice) {
                case 1 -> {
                    AddingTasks addTask = new AddingTasks();
                    addTask.addTask(tasks);
                }
                case 2 -> {
                    CompletedTasks doneTask = new CompletedTasks();
                    doneTask.doneTask(tasks);
                }
                case 3 -> {
                    RemoveTask taskRemove = new RemoveTask();
                    taskRemove.taskRemove(tasks);
                }
                case 4 -> {
                    EditTask changeTask = new EditTask();
                    changeTask.changeTask(tasks);
                }
                case 5 -> {
                    DisplayTasks taskDisplay = new DisplayTasks();
                    taskDisplay.taskDisplay(tasks);
                }
            }
        }
    }
}