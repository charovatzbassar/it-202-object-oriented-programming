package week3.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        this.tasks = Arrays.asList(new TaskItem(1, "Push lab code to GitHub", Status.TO_DO), new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS), new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED));
    }

    public List<TaskItem> getTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus (Status status) {
        return this.tasks.stream().filter(task -> task.getTaskStatus() == status).toList();
    }


    public List<TaskItem> idGreaterOrEqual2 () {
        return this.tasks.stream().filter(task -> task.getTaskId() >= 2).toList();
    }

    public void printTasks () {
        this.tasks.stream().forEach(task -> System.out.println(task.getTaskDescription()));
    }
}
