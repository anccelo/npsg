package com.npsg.admin.ctrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npsg.admin.service.PersonService;
import com.npsg.model.entities.PersonEntity;

@RestController
@RequestMapping(value = "person", produces = { "application/json" })
public class PersonCtrl {

	@Autowired
	private PersonService personService;

	// CRUD
	@PostMapping
	public boolean createPersonCtrl(@RequestBody(required = true) PersonEntity personEntity) {

		personService.createPersonService(personEntity);
		return true;
	}

	@GetMapping
	public List<PersonEntity> getAllPersonCtrl() {
		return personService.getAllPersonService();
	}

	// @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	// public ResponseEntity<PersonEntity> getOne(@PathVariable int id) {
	// PersonEntity result;
	// try {
	// result = personService.getOnePersonService(id);
	// } catch (Exception e) {
	// return new ResponseEntity<PersonEntity>(HttpStatus.NOT_FOUND);
	// }
	// return new ResponseEntity<PersonEntity>(result, HttpStatus.OK);
	// }

	@GetMapping(value = "/{id}")
	public Optional<PersonEntity> getOnePersonCtrl(@PathVariable int id) {
		return personService.getOnePersonService(id);
	}

	@PutMapping("/{id}")
	public boolean updateOnePersonCtrl(@RequestBody PersonEntity personEntity, @PathVariable int id) {
		if (personEntity.getIdPerson() != personService.getOnePersonService(id).get().getIdPerson())
			return false;
		else {
			personService.createPersonService(personEntity);

		}
		return true;
	}

	@DeleteMapping("/{id}")
	public boolean deleteOnePersonCtrl(@PathVariable int id) {
		return personService.deleteOnePersonService(id);
	}

}
