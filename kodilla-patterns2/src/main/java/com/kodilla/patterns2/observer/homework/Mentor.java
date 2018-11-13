package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkList homeworkList) {
        System.out.println(username + ": Sent homeworks " + homeworkList.getName() + "\n" +
        " (total: " + homeworkList.getMessages().size() + " messages");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
