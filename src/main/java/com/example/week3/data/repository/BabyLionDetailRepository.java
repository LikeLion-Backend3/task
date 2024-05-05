package com.example.week3.data.repository;

import com.example.week3.data.entity.BabyLionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyLionDetailRepository extends JpaRepository<BabyLionDetail, Long> {
}
