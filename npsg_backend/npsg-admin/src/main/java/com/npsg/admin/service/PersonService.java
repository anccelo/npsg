package com.npsg.admin.service;

import org.springframework.stereotype.Service;

import com.npsg.model.dao.AbstractDao;
import com.npsg.model.entities.PersonEntity;
import com.npsg.model.service.AbstractService;

@Service
public class PersonService extends AbstractService<PersonEntity> {

	public PersonService(AbstractDao<PersonEntity> AbstractDao) {
		super(AbstractDao);

	}

}