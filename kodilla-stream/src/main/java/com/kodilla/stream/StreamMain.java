package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forum.getUserList().stream()
                .filter(s -> s.getSex() == 'm')
                .filter(s -> Period.between(s.getDateOfBirth(),LocalDate.now()).getYears() >= 20)
                .filter(s -> s.getPublishedPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("Number of elements: " + mapOfUsers.size());
            mapOfUsers.entrySet().stream()
                    .map(entry ->entry.getKey() + " : " + entry.getValue())
                    .forEach(System.out::println);
    }
}