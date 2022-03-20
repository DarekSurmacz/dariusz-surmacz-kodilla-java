package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser("111", "George1", 'F', 1985, 9, 10, 8));
        forumUserList.add(new ForumUser("222", "George2", 'M', 1979, 11, 9, 7));
        forumUserList.add(new ForumUser("333", "George3", 'F', 1772, 1, 10, 6));
        forumUserList.add(new ForumUser("444", "George4", 'M', 2020, 2, 1, 5));
        forumUserList.add(new ForumUser("555", "George5", 'M', 2010, 3, 23, 0));
        forumUserList.add(new ForumUser("666", "George6", 'F', 2001, 9, 11, 3));
    }

    public List<ForumUser> getList() { return new ArrayList<>(forumUserList);}
}
