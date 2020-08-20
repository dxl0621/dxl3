package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.users_typeMapper;

import pojo.users_type;

@Service("users_typeService")
public class users_typeServiceimp implements users_typeService {

	@Resource
	private users_typeMapper mapper;
	public users_typeMapper getMapper() {
		return mapper;
	}
	public void setMapper(users_typeMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public users_type u(int id) {
		// TODO Auto-generated method stub
		return mapper.u(id);
	}

}
