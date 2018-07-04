package com.demo.service;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.demo.model.Admin;

@Mapper
public interface AdminService {

	@Select("SELECT * FROM `moxi`.`admin` where id = #{id}")
	Admin findById(Admin admin);
}
