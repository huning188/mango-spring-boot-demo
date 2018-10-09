package com.example.demo.dao;

import java.util.List;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.ReturnGeneratedId;
import org.jfaster.mango.annotation.SQL;

@DB
public interface IPersonDao {

	@ReturnGeneratedId
    @SQL("insert into person (uid, name,sex,desciption) values(:uid, :name, :sex, :desciption)")
    public int insert(Person person);
	
	@SQL("select uid,name,sex,desciption from person")
    public List<Person> select();
	
}
