package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class ForumUser {

    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate yearOfBirth;
    private int postCount = 0;

    public ForumUser(final int userID, final  String username, final char sex,
                     final LocalDate yearOfBirth, int postCount) {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }
    public int getAge() {
        return Period.between(yearOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUserID() == forumUser.getUserID() && getSex() == forumUser.getSex() && getPostCount() == forumUser.getPostCount()
                && getUsername().equals(forumUser.getUsername()) && getYearOfBirth().equals(forumUser.getYearOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getUsername(), getSex(), getYearOfBirth(), getPostCount());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", yearOfBirth=" + yearOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
