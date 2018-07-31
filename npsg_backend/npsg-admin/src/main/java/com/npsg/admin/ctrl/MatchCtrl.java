package com.npsg.admin.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npsg.model.controller.AbstractCtrl;
import com.npsg.model.entities.MatchEntity;
import com.npsg.model.service.AbstractService;

@RestController
@RequestMapping(value = "match", produces = { "application/json" })
public class MatchCtrl extends AbstractCtrl<MatchEntity> {

	public MatchCtrl(AbstractService<MatchEntity> abstractService) {
		super(abstractService);

	}

}
