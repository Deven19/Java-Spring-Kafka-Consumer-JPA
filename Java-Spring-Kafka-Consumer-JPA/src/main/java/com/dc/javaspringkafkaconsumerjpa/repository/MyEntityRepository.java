package com.dc.javaspringkafkaconsumerjpa.repository;

import com.dc.javaspringkafkaconsumerjpa.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
