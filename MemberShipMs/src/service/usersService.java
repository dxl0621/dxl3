package service;

import java.util.List;


import pojo.users;

public interface usersService {

	users slectUser(String NAME,String password);
	List<users>userselect( String NAME, int pagrIdex,int  pageSizi);
	int usercount(String NAME);

	int updata(int id ,String password);
}
