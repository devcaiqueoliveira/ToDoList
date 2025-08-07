import java.util.HashMap;

public class TaskCache {
    protected final HashMap<String, Task> taskHashMap = new HashMap<>();

    public void addTask(String taskName, Task task) {
        taskHashMap.put(taskName, task);
    }
    public void removeTask(String taskName) {
        taskHashMap.remove(taskName);
    }
}
