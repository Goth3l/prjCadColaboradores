package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.CollaboratorService;
import com.example.demo.entities.Collaborator;




@RestController
@RequestMapping("/Collaborator")
public class CollaborController {

	private final CollaboratorService collaboratorservice;
	
	@Autowired
	public CollaborController(CollaboratorService collaboratorservice){
		this.collaboratorservice = collaboratorservice;
	}
	
	@PostMapping
	public Collaborator createCustomer (@RequestBody Collaborator collaborator) {
		return collaboratorservice.saveCollaborator(collaborator);
	}
	
	@GetMapping
	public List<Collaborator> getAllCollaborator(){
		return collaboratorservice.getAllCollaborator();
	}
	
	@GetMapping("/id")
	public Collaborator getCustomer(@PathVariable Long id) {
		return collaboratorservice.getCollaboratorById(id);
	}
	
	@DeleteMapping("/id")
	public void deleteCustomer(@PathVariable Long id) {
		collaboratorservice.deleteCollaborator(id);
	}

}
