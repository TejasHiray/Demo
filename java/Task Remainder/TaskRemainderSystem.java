import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class TaskReminderSystem {
    private List<Task> tasks;

    public TaskReminderSystem() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title, String category, int priority, LocalDate dueDate) {
        tasks.add(new Task(title, category, priority, dueDate));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void markTaskAsCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            Task task = tasks.get(taskIndex);
            task.setCompleted(true);
        }
    }

    // Other methods for task management
}

