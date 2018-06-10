package com.npsg.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npsg.admin.repository.PersonDAO;
import com.npsg.model.entities.PersonEntity;

@Service
public class PersonService {

	@Autowired
	private PersonDAO personDao;

	public String createPersonService(PersonEntity personEntity) {
		personDao.save(personEntity);
		return "registrato";
	}

	public List<PersonEntity> getAllPersonService() {
		return personDao.findAll();
	}

	public Optional<PersonEntity> getOnePersonService(Integer id) {
		return personDao.findById(id);
	}

	public Boolean deleteOnePersonService(int id) {
		if (personDao.existsById(id)) {
			personDao.deleteById(id);
			return true;
		} else
			return false;
	}
}
