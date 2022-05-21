package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    int quantityOfUsers;
    int quantityOfPosts;
    int quantityOfComments;
    double averageQuantityPostsForUser;
    double averageQuantityCommentsForUser;
    double averageQuantityCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();

        if(quantityOfUsers != 0){
            averageQuantityPostsForUser = (double) quantityOfPosts / quantityOfUsers;
            averageQuantityCommentsForUser = (double) quantityOfComments / quantityOfUsers;
        } else {
            averageQuantityPostsForUser = 0;
            averageQuantityCommentsForUser = 0;
        }

        if(quantityOfPosts !=0){
            averageQuantityCommentsOnPost = (double) quantityOfComments / quantityOfPosts;
        } else {
            averageQuantityCommentsOnPost = 0;
        }
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public double getAverageQuantityPostsOnUser() {
        return averageQuantityPostsForUser;
    }

    public double getAverageQuantityCommentsForUser() {
        return averageQuantityCommentsForUser;
    }

    public double getAverageQuantityCommentsOnPost() {
        return averageQuantityCommentsOnPost;
    }
}
