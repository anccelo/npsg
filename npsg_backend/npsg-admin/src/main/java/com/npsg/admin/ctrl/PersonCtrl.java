package com.npsg.admin.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npsg.model.controller.AbstractCtrl;
import com.npsg.model.entities.PersonEntity;
import com.npsg.model.service.AbstractService;

@RestController
@RequestMapping(value = "person", produces = { "application/json" })
public class PersonCtrl extends AbstractCtrl<PersonEntity> {

	public PersonCtrl(AbstractService<PersonEntity> abstractService) {
		super(abstractService);

	}

}