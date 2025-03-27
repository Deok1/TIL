package collection.map.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {

    private Deque<Task> tasks = new ArrayDeque<>();


    public void addTask(Task task) {
        tasks.offer(task);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();     //오버라이딩 되어있는 execute 실행
        }
    }
}
