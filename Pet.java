import java.util.ArrayList;
import java.util.List;

abstract class Pet {
    String name;
    List<CareTask> tasks = new ArrayList<>();

    Pet(String name) {
        this.name = name;
        addDefaultTasks();
    }

    abstract void addDefaultTasks();

    void addTask(CareTask task) {
        tasks.add(task);
    }

    void show(String time, String date) {
        for (CareTask t : tasks) {
            t.check(time, date, name);
        }
    }
}