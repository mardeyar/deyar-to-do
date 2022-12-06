public class DisplayTasks {
    public void taskDisplay(Tasks task) {
        System.out.printf("%-40s| %-11s| %-11s| %-40s", "##TaskID##", "Due Date", "Status", "Description");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < task.taskList.size(); i++) {
            System.out.printf(String.format("%-40s| %-11s| %-11s| %-40s", i + 1 + ". " + task.taskList.get(i), task.taskDue.get(i),
                    task.taskStat.get(i), task.taskDesc.get(i)));
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
}
