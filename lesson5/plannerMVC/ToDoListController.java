package lesson5.plannerMVC;

import java.util.Scanner;

public class ToDoListController {
    private ToDoListModel model;
    private ToDoListView view;
    private Scanner scanner;

    public ToDoListController(ToDoListModel model, ToDoListView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void runToDoList() {
        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать список задач");
            System.out.println("3. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            switch (choice) {
                case 1:
                    System.out.print("Введите новую задачу: ");
                    String task = scanner.nextLine();
                    model.addTask(task);
                    break;
                case 2:
                    view.displayTasks(model.getTasks());
                    break;
                case 3:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }

    }
}