package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping("/save/{name}/{age}")
	public String savePerson(@PathVariable String name,@PathVariable int age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		personRepository.save(person);
		return "Saved";
	}
}
