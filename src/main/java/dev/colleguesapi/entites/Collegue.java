/**
 * 
 */
package dev.colleguesapi.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** Représentation d'un collègue
 *
 * @author KOMINIARZ Anaïs
 *
 */
@Entity
@Table(name="collegue")
public class Collegue {
	
	@Id
	Integer Id;
	
	String matricule;
	String nom;
	String prenoms;
	String email;
	LocalDate dateDeNaissance;
	String photoUrl;
	
	/** Getter
	 *
	 * @return the id
	 */
	public Integer getId() {
		return Id;
	}
	/** Setter
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		Id = id;
	}
	/** Getter
	 *
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}
	/** Setter
	 *
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	/** Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter
	 *
	 * @return the prenoms
	 */
	public String getPrenoms() {
		return prenoms;
	}
	/** Setter
	 *
	 * @param prenoms the prenoms to set
	 */
	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}
	/** Getter
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/** Setter
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/** Getter
	 *
	 * @return the dateDeNaissance
	 */
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	/** Setter
	 *
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	/** Getter
	 *
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}
	/** Setter
	 *
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

}
