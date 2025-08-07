public class TaskManager {
    private TaskCache taskCache;
    private TaskValidator taskValidator;

    public void createTask(String taskName, Task task) throws Exception {
        taskValidator.validateCreateTask(taskName);
        taskCache.addTask(taskName, task);
    }
    public void deleteTask(String taskName) {
        taskCache.removeTask(taskName);
    }
}
