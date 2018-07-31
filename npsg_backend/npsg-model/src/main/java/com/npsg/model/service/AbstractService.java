package com.npsg.model.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.transaction.annotation.Transactional;

import com.npsg.model.dao.AbstractDao;

public class AbstractService<T> {

	protected AbstractDao<T> abstractDao;

	public AbstractService(AbstractDao<T> abstractDao) {
		this.abstractDao = abstractDao;

	}

	@Transactional
	public String createService(T object) {
		abstractDao.save(object);
		return "registrato";
	}

	@Transactional
	public List<T> getAllService() {
		return abstractDao.findAll();
	}

	@Transactional
	public Optional<T> getOneService(Id id) {
		return abstractDao.findById(id);
	}

	public Boolean deleteOneService(Id id) {
		if (abstractDao.existsById(id)) {
			abstractDao.deleteById(id);
			return true;
		} else
			return false;
	}

	public boolean deleteAllService() {
		abstractDao.deleteAll();
		return true;
	}

}
