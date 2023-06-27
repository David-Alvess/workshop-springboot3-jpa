package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController //anotation para implementar o controlador rest
@RequestMapping(value = "/users") //anotation para nomear o recurso 
public class UserResources {
	
	@GetMapping
	//o ResponseEntity<T> é um tipo especifico usado para retornar respostas de requisições web 
	public ResponseEntity<User> findAll (){
		User u = new User(1L, "Maria", "maria@gmail.com", "99999-9999", "12345");
		
		return ResponseEntity.ok().body(u); //.body(u);
	}
}
