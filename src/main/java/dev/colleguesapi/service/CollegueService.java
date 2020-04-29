/**
 * 
 */
package dev.colleguesapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.colleguesapi.controller.CollegueDto;
import dev.colleguesapi.entites.Collegue;
import dev.colleguesapi.exceptions.CollegueByMatriculeNotExistException;
import dev.colleguesapi.exceptions.CollegueByNomNotExistException;
import dev.colleguesapi.repository.CollegueRepository;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
@Service
public class CollegueService {
	
	private CollegueRepository collegueRepository;
	
	public CollegueService(CollegueRepository collegueRepository) {
		this.collegueRepository = collegueRepository;
	}
	

	public List<String> rechercheCollegueParNom(String nom){
		List<String> colleguesTrouves = new ArrayList<String>();
		
		for (Collegue collegue : collegueRepository.findAll()) {
			if (collegue.getNom().equals(nom)) {
				colleguesTrouves.add(collegue.getMatricule());
			}
		}
		if (colleguesTrouves.isEmpty()) {
			throw new CollegueByNomNotExistException("le nom inséré ne correspond à aucun collègue.");
		}
		return colleguesTrouves;
	}
	
	public CollegueDto rechercheCollegueParMatricule(String matricule) {
		 
		CollegueDto collegueRecup = new CollegueDto();
		Boolean collegueTrouve = false;
		for (Collegue collegue : collegueRepository.findAll()) {
			if (collegue.getMatricule().equals(matricule)) {
				collegueTrouve = true;
				collegueRecup.setMatricule(matricule);
				collegueRecup.setNom(collegue.getNom());
				collegueRecup.setPrenoms(collegue.getPrenoms());
				collegueRecup.setDateDeNaissance(collegue.getDateDeNaissance());
				collegueRecup.setPhotoUrl(collegue.getPhotoUrl());
			}
		}
		if (collegueTrouve == false) {
			throw new CollegueByMatriculeNotExistException("le matricule inséré ne correspond à aucun collègue.");
		}
		return collegueRecup;
		
	}

}
