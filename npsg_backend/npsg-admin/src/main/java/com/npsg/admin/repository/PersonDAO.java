package com.npsg.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npsg.model.entities.PersonEntity;

public interface PersonDAO extends JpaRepository<PersonEntity, Integer> {

}
