package com.npsg.admin.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npsg.model.controller.AbstractCtrl;
import com.npsg.model.entities.LocationEntity;
import com.npsg.model.service.AbstractService;

@RestController
@RequestMapping(value = "/location", produces = { "application/json" })
public class LocationCtrl extends AbstractCtrl<LocationEntity> {

	public LocationCtrl(AbstractService<LocationEntity> abstractService) {
		super(abstractService);
	}

}
