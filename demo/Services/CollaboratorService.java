package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Collaborator;
import com.example.demo.repositories.CollaboratorRepository;

@Service
public class CollaboratorService {

	private final CollaboratorRepository collaboratorRepository;

	@Autowired
	public CollaboratorService(CollaboratorRepository collaboratorRepository) {
		this.collaboratorRepository = collaboratorRepository;
	}

	// Criação do cliente
	public Collaborator saveCollaborator(Collaborator collaborator) {
		return collaboratorRepository.save(collaborator);
	}

	// Buscar cliente
	public Collaborator getCollaboratorById(Long id) {
		return collaboratorRepository.findById(id).orElse(null);
	}

	// Procurar todos os clientes
	public List<Collaborator> getAllCollaborator() {
		return collaboratorRepository.findAll();
	}

	// Excluir os clientes
	public void deleteCollaborator(Long id) {
		collaboratorRepository.deleteById(id);
	}

}