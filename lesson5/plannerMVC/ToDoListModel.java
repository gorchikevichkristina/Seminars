package lesson5.plannerMVC;

import java.util.ArrayList;
import java.util.List;

public class ToDoListModel {
    private List<String> tasks;

    public ToDoListModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
