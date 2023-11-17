package lesson5.plannerMVC;

public class Main {
    public static void main(String[] args) {
        ToDoListModel model = new ToDoListModel();
        ToDoListView view = new ToDoListView ();
        ToDoListController controller = new ToDoListController(model, view);

        controller.runToDoList();
    }
}
