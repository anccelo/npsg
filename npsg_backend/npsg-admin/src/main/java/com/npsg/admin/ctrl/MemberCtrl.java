package com.npsg.admin.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npsg.model.controller.AbstractCtrl;
import com.npsg.model.entities.MemberEntity;
import com.npsg.model.service.AbstractService;

@RestController
@RequestMapping(value = "/member", produces = { "application/json" })
public class MemberCtrl extends AbstractCtrl<MemberEntity> {

	public MemberCtrl(AbstractService<MemberEntity> abstractService) {
		super(abstractService);
	}

}
