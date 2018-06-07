package com.npsg.admin.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npsg.admin.service.PersonService;
import com.npsg.model.entities.PersonEntity;

@RestController
@RequestMapping(value = "person")
public class PersonCtrl {
	@Autowired
	private PersonService personService;

	// public PersonService personService = new PersonService();

	@GetMapping
	public String testGet() {
		return "ciao";
	}

	// CRUD
	@PostMapping
	public boolean createPersonCtrl(@RequestBody(required = true) PersonEntity personEntity) {

		personService.createPersonService(personEntity);
		return true;
	}

}
