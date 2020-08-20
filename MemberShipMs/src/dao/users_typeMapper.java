package dao;

import org.apache.ibatis.annotations.Param;

import pojo.users_type;

public interface users_typeMapper {

	users_type u(@Param("id")int id);
}
