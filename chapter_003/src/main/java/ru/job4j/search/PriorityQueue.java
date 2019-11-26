package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        if (tasks.isEmpty() || (task.getPriority() >= tasks.getLast().getPriority())) {
            tasks.add(task);
        } else {
            for (Task t : tasks) {
                if (task.getPriority() <= t.getPriority()) {
                    tasks.add(index, task);
                    break;
                }
                index++;
            }
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}