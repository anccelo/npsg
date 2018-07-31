package com.npsg.admin.service;

import org.springframework.stereotype.Service;

import com.npsg.model.dao.AbstractDao;
import com.npsg.model.entities.LocationEntity;
import com.npsg.model.service.AbstractService;

@Service
public class LocationService extends AbstractService<LocationEntity> {

	public LocationService(AbstractDao<LocationEntity> abstractDao) {
		super(abstractDao);
	}

}
