/**
 * 
 */
package dev.colleguesapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.colleguesapi.controller.CollegueDto;
import dev.colleguesapi.entites.Collegue;
import dev.colleguesapi.exceptions.CollegueException;
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
			throw new CollegueException("le collègue recherché n'existe pas.");
		}
		return colleguesTrouves;
	}
	
	public CollegueDto rechercheCollegueParMatricule(String matricule) {
		 
		CollegueDto collegueRecup = new CollegueDto();
		
		for (Collegue collegue : collegueRepository.findAll()) {
			if (collegue.getMatricule().equals(matricule)) {
				collegueRecup.setMatricule(matricule);
				collegueRecup.setNom(collegue.getNom());
				collegueRecup.setPrenoms(collegue.getPrenoms());
				collegueRecup.setDateDeNaissance(collegue.getDateDeNaissance());
				collegueRecup.setPhotoUrl(collegue.getPhotoUrl());
			}
		}
		return collegueRecup;
		
	}

}
