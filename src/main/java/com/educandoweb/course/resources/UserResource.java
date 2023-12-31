package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController //anotation para implementar o controlador rest
@RequestMapping(value = "/users") //anotation para nomear o recurso 
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	//o ResponseEntity<T> é um tipo especifico usado para retornar respostas de requisições web 
	public ResponseEntity<List<User>> findAll (){
		List<User> list = userService.findAll();
		return ResponseEntity.ok().body(list); //.body(u);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
