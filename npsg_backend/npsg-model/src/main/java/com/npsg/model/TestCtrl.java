package com.npsg.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/person")
public class TestCtrl {

	// // public PersonService personService = new PersonService();
	//
	// @Autowired
	// PersonService personService;
	//
	// @GetMapping
	// public void testGet() {
	// System.out.println("ciao Angelo");
	// }
	//
	// // CRUD
	// @PostMapping
	// public boolean createPersonCtrl(@RequestBody(required = true) PersonEntity
	// personEntity) {
	// personService.createPersonService(personEntity);
	// return true;
	// }

}
