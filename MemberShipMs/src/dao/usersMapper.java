package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.users;

public interface usersMapper {

	users slectUser(@Param("NAME")String NAME,@Param("password")String password);
	
	List<users>userselect(@Param("NAME")String NAME,
			@Param("start") int start,@Param("pageSizi")int  pageSizi);
	
	/**
	 * ²éÑ¯×ÜÒ³Êý
	 */
	int usercount(@Param("NAME")String NAME);
	
	int updata(@Param("id") int id,@Param("password") String password);
	
}
