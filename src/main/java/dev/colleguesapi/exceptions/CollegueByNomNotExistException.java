package dev.colleguesapi.exceptions;

/** Exception si on recherche un collègue à partir d'un nom non existant
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CollegueByNomNotExistException extends RuntimeException{

	public CollegueByNomNotExistException(String message) {
		super(message);
	}
}
