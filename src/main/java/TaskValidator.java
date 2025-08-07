import java.nio.file.FileAlreadyExistsException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskValidator {
    public TaskCache taskCache;

    public void validateCreateTask(String taskName) throws Exception {
        validateNameTask(taskName);
    }
    public void validateNameTask(String taskName) throws Exception{
        if (taskName == null || taskName.isEmpty()) {
            throw new NullPointerException("A tarefa precisa ter um nome.");
        }

        if (taskCache.taskHashMap.containsKey(taskName)) {
            throw new FileAlreadyExistsException("Já existe uma tarefa com este nome");
        }

        Pattern pattern = Pattern.compile("[a-zA-Z0-9 ]+");
        Matcher matcher = pattern.matcher(taskName);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("O nome da tarefa não pode conter caracteres especiais.");
        }
    }
}
