package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        if (tasks.size() == 0 || task.getPriority() >= tasks.getLast().getPriority()) {
            tasks.add(task);
        } else {
            for (int i = 0; i <= tasks.size(); i++) {
                if (task.getPriority() <= tasks.get(i).getPriority()) {
                    tasks.add(i, task);
                    break;
                }
            }
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}