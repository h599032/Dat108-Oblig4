package no.hvl.dat108.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

//@Entity
//@Table(schema = "application_form")
public class Deltaker {

	// @Id
	@NotNull(message = "Field cannot be empty")
	@Size(min = 2, max = 20, message = "Must be between 2 and 20 characters")
	@Pattern(regexp = "^[A-ZÆØÅ][-a-zæøå\s]{2,19}$", message = "Must start with a capital letter")
	private String fornavn;

	@NotNull(message = "Field cannot be empty")
	@Size(min = 2, max = 20, message="Must be bewtween 2 and 20 characters")
	@Pattern(regexp = "^[A-ZÆØÅ][-a-zæøå]{2,19}$", message = "Must start with a capital letter")
	private String etternavn;
	
	//TODO : MAKE UNIQUE
	@NotNull(message = "Field cannot be empty")
	@Size(min = 8, max=8, message="Must be 8 digits")
	private String mobil;
	
	
	//TODO : MUST MATCH PREVIOUS PASSWORD
	@Size(min=6, message="Must be at least 6 characters long")
	@NotNull(message = "Field cannot be empty")
	private String passord;

	private String passordRepetert;
	
	
	private String mann;

	private String kvinne;

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

	public String getPassordRepetert() {
		return passordRepetert;
	}

	public void setPassordRepetert(String passordRepetert) {
		this.passordRepetert = passordRepetert;
	}

	public String getMann() {
		return mann;
	}

	public void setMann(String mann) {
		this.mann = mann;
	}

	public String getKvinne() {
		return kvinne;
	}

	public void setKvinne(String kvinne) {
		this.kvinne = kvinne;
	}

	
}
