package com.pjb.sandbox.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

import com.pjb.sandbox.model.Person;

@Service("personService")
public class MockPersonService implements PersonService {

	public Person getById(Integer id) {
		
		Person p = create(id);
		Collection<Person> friends = new ArrayList<Person>();
		friends.add(create(777));
		friends.add(create(999));
		
		p.setFriends(friends);
		
		return p;
	}
	
	private Person create(Integer id) {
		Person p = new Person();
		p.setId(id);
		p.setName("paulo-"+id);
		return p;
	}
	
	

}
