package com.npsg.model.dao;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractDao<T> extends JpaRepository<T, Id> {

}
