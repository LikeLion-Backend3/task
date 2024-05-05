package com.example.week3.data.dao;

import com.example.week3.data.entity.BabyLion;

public interface BabyLionDAO {
    BabyLion insertLion(BabyLion babyLion);
    BabyLion selectLion(String email) throws Exception;
    BabyLion updateLionName(String email, String name) throws Exception;
    void deleteLion(String email) throws Exception;
}
