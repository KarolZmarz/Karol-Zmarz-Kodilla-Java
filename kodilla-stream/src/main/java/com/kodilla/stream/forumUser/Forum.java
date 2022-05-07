package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        addUser(new ForumUser(1, "Bartek",      'M', LocalDate.of(2000,4,12),34  ));
        addUser(new ForumUser(2, "Karol",    'M', LocalDate.of(2002,1,17),2 ));
        addUser(new ForumUser(3, "Julia",       'F', LocalDate.of(2002,8,16),12  ));
        addUser(new ForumUser(4, "Anastazja",     'F', LocalDate.of(1999,6,1),56 ));
        addUser(new ForumUser(5, "Basia",       'F', LocalDate.of(2003,1,13) ,0 ));


    }

    public void addUser(ForumUser user){
        forumUsers.add(user);
    }

    public List<ForumUser> getForumUsers(){
        return new ArrayList<>(forumUsers);
    }
}
