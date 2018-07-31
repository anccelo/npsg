package com.npsg.model.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.npsg.model.service.AbstractService;

public class AbstractCtrl<T> {

	protected AbstractService<T> abstractService;

	public AbstractCtrl(AbstractService<T> abstractService) {
		this.abstractService = abstractService;
	}

	@PostMapping
	public boolean create(@RequestBody T object) {
		abstractService.createService(object);
		return true;
	}

	@GetMapping
	public List<T> getAllCtrl() {
		return abstractService.getAllService();
	}

	@GetMapping(value = "/{id}")
	public Optional<T> getOnePersonCtrl(@PathVariable Id id) {
		return abstractService.getOneService(id);
	}

	@PutMapping("/{id}")
	public boolean updateOneCtrl(@RequestBody T object) {
		if (true)
			abstractService.createService(object);
		return true;
	}

	@DeleteMapping("/{id}")
	public boolean deleteOnePersonCtrl(@PathVariable Id id) {
		return abstractService.deleteOneService(id);
	}

	@DeleteMapping("/all")
	public boolean delateAllCtrl() {
		return abstractService.deleteAllService();

	}

}
