package lesson5.plannerMVC;

import java.util.List;

public class ToDoListView {
    public void displayTasks(List<String> tasks) {
        System.out.println("Список задач:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}