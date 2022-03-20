package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class ForumUser {
    private final String userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(String userId, String userName, char sex,
                     int yearOfBirth, int monthOfBirth, int dayOfBirth, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getAge() {

        LocalDate today = LocalDate.now();

        long duration = ChronoUnit.YEARS.between(birthDate, today);

        return (int) duration;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
