package com.kodilla.testing.forum.statistics;

public class StatCounter {

    int users;
    int posts;
    int comments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    void calculateAdvStatistics(Statistics statistics) {

        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        if (users > 0) {
            averagePostsPerUser = posts / (double) users;
        } else {
            averagePostsPerUser = 0;
        }

        if (users > 0) {
            averageCommentsPerUser = comments / (double) users;
        } else {
            averageCommentsPerUser = 0;
        }

        if (posts > 0) {
            averageCommentsPerPost = comments / (double) posts;
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public int getUsersCount() {
        return users;
    }

    public int getPostsCount() {
        return posts;
    }

    public int getCommentsCount() {
        return comments;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }
}