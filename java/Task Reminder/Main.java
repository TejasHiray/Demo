import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private String name;
    private LocalDate dueDate;
    private String category;
    private int priority; // 1 (low) to 3 (high)
    private boolean completed;

    public Task(String name, LocalDate dueDate, String category, int priority) {
        this.name = name;
        this.dueDate = dueDate;
        this.category = category;
        this.priority = priority;
        this.completed = false;
    }

    // Getters and setters

    public void markAsCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        String status = completed ? "Completed" : "Pending";
        return "Task: " + name + "\nDue Date: " + dueDate + "\nCategory: " + category +
                "\nPriority: " + priority + "\nStatus: " + status + "\n";
    }
}

class TaskReminderApp {
    private List<Task> tasks;
    private Scanner scanner;

    public TaskReminderApp() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void createTask() {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter due date (yyyy-MM-dd): ");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter priority (1 - low, 2 - medium, 3 - high): ");
        int priority = Integer.parseInt(scanner.nextLine());

        Task task = new Task(name, dueDate, category, priority);
        tasks.add(task);
        System.out.println("Task created successfully!");
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void markTaskAsCompleted() {
        System.out.print("Enter the index of the task to mark as completed: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;

        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Reminder Application");
            System.out.println("1. Create Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TaskReminderApp app = new TaskReminderApp();
        app.run();
    }
}


