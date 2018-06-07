package com.npsg.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npsg.admin.repository.PersonDAO;
import com.npsg.model.entities.PersonEntity;

@Service
public class PersonService {

	@Autowired
	private PersonDAO personDao;

	public String createPersonService(PersonEntity personEntity) {
		System.out.println(personEntity.getDomicile());

		personDao.save(personEntity);
		return "registrato";
	}

}
