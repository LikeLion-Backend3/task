package com.example.week3.data.dao.impl;

import com.example.week3.data.dao.BabyLionDAO;
import com.example.week3.data.entity.BabyLion;
import com.example.week3.data.repository.BabyLionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class BabyLionDAOImpl implements BabyLionDAO {
    private final BabyLionRepository babyLionRepository;

    @Autowired
    public BabyLionDAOImpl(BabyLionRepository babyLionRepository) {
        this.babyLionRepository = babyLionRepository;
    }

    @Override
    public BabyLion insertLion(BabyLion babyLion) {
        BabyLion result = babyLionRepository.save(babyLion);
        return result;
    }

    @Override
    public BabyLion selectLion(String email) throws Exception {
        Optional<BabyLion> babyLion = babyLionRepository.findByEmail(email);
        if(babyLion.isPresent()) {
            BabyLion result = babyLion.get();
            return result;
        } else {
            throw new Exception("Cannot find Lion");
        }
    }

    @Override
    public BabyLion updateLionName(String email, String name) throws Exception {
        Optional<BabyLion> findLion = babyLionRepository.findByEmail(email);
        BabyLion result;

        if(findLion != null){
            BabyLion babyLion = findLion.get();

            babyLion.setName(name);
            babyLion.setUpdatedAt(LocalDateTime.now());

            result = babyLionRepository.save(babyLion);
        }else{
            throw new Exception("Cannot update Lion");
        }
        return result;
    }

    @Override
    public void deleteLion(String email) throws Exception {
        Optional<BabyLion> babyLion = babyLionRepository.findByEmail(email);
        if(babyLion.isPresent()) {
            BabyLion result = babyLion.get();
            babyLionRepository.delete(result);
        } else {
            throw new Exception("Cannot delete Lion");
        }
    }
}
