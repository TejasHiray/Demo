import java.time.LocalDate;

class Task {
    private String title;
    private String category;
    private int priority;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, String category, int priority, LocalDate dueDate) {
        this.title = title;
        this.category = category;
        this.priority = priority;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    // Getters and setters
}
