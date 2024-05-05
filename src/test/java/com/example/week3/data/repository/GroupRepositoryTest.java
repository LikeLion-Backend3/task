package com.example.week3.data.repository;

import com.example.week3.data.entity.BabyLion;
import com.example.week3.data.entity.Group;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GroupRepositoryTest {
    @Autowired
    GroupRepository groupRepository;

    @Autowired
    BabyLionRepository babyLionRepository;

    @Test
    @DisplayName("아기사자 그룹 테스트")
    void relationshipTest() {
        BabyLion babyLion = new BabyLion();
        babyLion.setName("유멋사");
        babyLion.setEmail("kangnam@likelion.org");
        babyLion.setNumber("011-1234-5678");
        babyLion.setPassword("0000");
        babyLion.setProfile("none");

        babyLionRepository.save(babyLion);

        Group group = new Group();
        group.setGroupName("멋쟁이사자처럼");
        group.getMembers().add(babyLion);

        groupRepository.save(group);
        System.out.println("group.getId() = " + group.getId());
    }

    @Test
    @DisplayName("아기사자 그룹 테스트")
    void babyLionGroupTest() {
        List<BabyLion> members = groupRepository.findById(1L).get().getMembers();

        for (BabyLion foundBabyLion : members) {
            System.out.println("foundBabyLion = " + foundBabyLion);
        }
    }
}