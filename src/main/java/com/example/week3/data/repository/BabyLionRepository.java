package com.example.week3.data.repository;

import com.example.week3.data.entity.BabyLion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BabyLionRepository extends JpaRepository<BabyLion, Long> {
    Optional<BabyLion> findByEmail(String email);
}
