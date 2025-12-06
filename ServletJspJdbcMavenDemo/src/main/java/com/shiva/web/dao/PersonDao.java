package com.shiva.web.dao;

import com.shiva.web.model.Person;

public class PersonDao {
	
	public Person getPerson(int pid) {
		Person p = new Person();
		p.setPid(1);
		p.setPname("shiva");
		
		return p;
	}
}
