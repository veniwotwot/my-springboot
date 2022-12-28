package com.bby.myspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bby.myspringboot.entity.Human;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<Human, Long> {
}

