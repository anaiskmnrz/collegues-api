package dev.colleguesapi.exceptions;

/** Exception si on recherche un collègue à partir d'un matricule non existant
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CollegueByMatriculeNotExistException extends RuntimeException{

	public CollegueByMatriculeNotExistException(String message) {
		super(message);
	}
}
