package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> Users = forum.getForumUsers().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getAge() >= 20)
                .filter(user -> user.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        Users.forEach((key, value) -> System.out.println("ID:" + key + " " + value.toString()));







    }

}
