package dev.colleguesapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.colleguesapi.entites.Collegue;
import dev.colleguesapi.exceptions.CollegueException;
import dev.colleguesapi.service.CollegueService;

@RestController
@RequestMapping("collegues")
public class CollegueController {
	
	private CollegueService collegueService;
	//private CollegueRepository collegueRepository;
	
	/** Constructeur
	 *
	 * @param collegueService
	 */
	public CollegueController(CollegueService collegueService) {
		super();
		this.collegueService = collegueService;
	}
	
	@GetMapping
	public List<String> rechercheCollegueParNom(@RequestParam String nom){
		return collegueService.rechercheCollegueParNom(nom);
		/*List<String> matriculesRecup = collegueService.rechercheCollegueParNom(nom);
		return ResponseEntity.status(HttpStatus.ACCEPTED).header("resultat", "le client a été trouvé").body(matriculesRecup);*/
	}
	
    @GetMapping("{matricule}")
    public ResponseEntity<CollegueDto> rechercheCollegueParMatricule(@PathVariable String matricule) {
    	CollegueDto collegueRecup = collegueService.rechercheCollegueParMatricule(matricule);
    	return ResponseEntity.status(HttpStatus.ACCEPTED).header("resultat", "le collègue a été trouvé").body(collegueRecup);
    }
	
	 /* Gestion des EXCEPTIONS */
    @ExceptionHandler(CollegueException.class)
  	public ResponseEntity<ErreurDto> quandClientException(CollegueException ex) {
    	ErreurDto erreurDto = new ErreurDto();
    	erreurDto.addMessage(ex.getMessage());
    	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erreurDto);
  	}
    
	

}
