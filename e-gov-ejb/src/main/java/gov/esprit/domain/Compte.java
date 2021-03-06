package gov.esprit.domain;

import gov.esprit.domain.Citoyen;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Compte
 *
 */
@Entity

public class Compte implements Serializable {

	
	private int id;
	private int numero;
	private LocalDate dateOuverture;
	private Citoyen proprietaire;
	private float solde;
	private List<Transaction>transactions;
	private static final long serialVersionUID = 1L;

	public Compte() {
		super();
	} 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}   
	public LocalDate getDateOuverture() {
		return this.dateOuverture;
	}

	public void setDateOuverture(LocalDate dateOuverture) {
		this.dateOuverture = dateOuverture;
	}  
	@ManyToOne
	@JoinColumn(name="citoyenId",referencedColumnName="id")
	public Citoyen getProprietaire() {
		return this.proprietaire;
	}

	public void setProprietaire(Citoyen proprietaire) {
		this.proprietaire = proprietaire;
	}   
	public float getSolde() {
		return this.solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	@OneToMany
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
   
}
