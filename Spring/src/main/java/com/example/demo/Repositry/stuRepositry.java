package com.example.demo.Repositry;
import com.example.demo.Entity.StuEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

public interface stuRepositry extends JpaRepository<StuEntity, Integer> {

}
