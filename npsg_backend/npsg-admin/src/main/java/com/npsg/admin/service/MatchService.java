package com.npsg.admin.service;

import org.springframework.stereotype.Service;

import com.npsg.model.dao.AbstractDao;
import com.npsg.model.entities.MatchEntity;
import com.npsg.model.service.AbstractService;

@Service
public class MatchService extends AbstractService<MatchEntity> {

	public MatchService(AbstractDao<MatchEntity> AbstractDao) {
		super(AbstractDao);
	}

}
