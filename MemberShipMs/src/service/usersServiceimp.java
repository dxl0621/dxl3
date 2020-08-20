package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.usersMapper;

import pojo.users;

@Service("usersService")
public class usersServiceimp implements usersService{

	@Resource
	private usersMapper mapper;
	public usersMapper getMapper() {
		return mapper;
	}
	public void setMapper(usersMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public users slectUser(String NAME, String password) {
		
		return mapper.slectUser(NAME, password);
	}
	@Override
	public List<users> userselect(String NAME, int pagrIdex, int pageSizi) {
		// TODO Auto-generated method stub
		//开始查询的索引=（当前页-1）*页面大小
		int start = (pagrIdex - 1) * pageSizi;
		return mapper.userselect(NAME, start, pageSizi);
	}
	@Override
	public int usercount(String NAME) {
		// TODO Auto-generated method stub
		return mapper.usercount(NAME);
	}
	@Override
	public int updata(int id, String password) {
		
		return mapper.updata(id, password);
	}

}
