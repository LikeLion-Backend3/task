package com.example.week3.data.repository;

import com.example.week3.data.entity.Comment;
import com.example.week3.data.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Test
    @DisplayName("유저 추가 테스트")
    void createUser() {
        User user = new User();
        user.setName("테스트");
        user.setEmail("abc@kangnam.ac.kr");
        user.setPassword("1234");
        user.setAddress("강남로 40");
        user.setPhone("010-1111-1111");
        userRepository.save(user);

        Comment comment = new Comment();
        comment.setComment("abc");
        comment.setUser(user);

        commentRepository.save(comment);
    }
}