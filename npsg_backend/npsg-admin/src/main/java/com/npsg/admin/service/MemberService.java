package com.npsg.admin.service;

import org.springframework.stereotype.Service;

import com.npsg.model.dao.AbstractDao;
import com.npsg.model.entities.MemberEntity;
import com.npsg.model.service.AbstractService;

@Service
public class MemberService extends AbstractService<MemberEntity> {

	public MemberService(AbstractDao<MemberEntity> abstractDao) {
		super(abstractDao);
	}

}
