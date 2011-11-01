package com.pjb.sandbox.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pjb.sandbox.model.Person;
import com.pjb.sandbox.service.PersonService;

@Controller
@RequestMapping("/rest/person")
public class PersonRestEndpoint {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, headers={"Accept=application/json"})
	public @ResponseBody Person getPerson(@PathVariable("id") String id) {
		return personService.getById(Integer.valueOf(id));
	}
}
