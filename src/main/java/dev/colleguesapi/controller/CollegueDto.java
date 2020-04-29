package dev.colleguesapi.controller;

import java.time.LocalDate;

public class CollegueDto {

	private String matricule;
	private String nom;
	private String prenoms;
	private LocalDate dateDeNaissance;
	private String photoUrl;
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
