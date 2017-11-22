package entities;

import java.util.Date;

/**
 * Created by zied on 22/11/2017.
 */
public class Compte {

    private int numCompte;
    private Date dateCreationCompte;
    private String ownerCompte;
    private float soldeEnDinars;



    public Compte() {
    }

    public Compte(int numCompte, Date dateCreationCompte, String ownerCompte, float soldeEnDinars) {
        this.numCompte = numCompte;
        this.dateCreationCompte = dateCreationCompte;
        this.ownerCompte = ownerCompte;
        this.soldeEnDinars = soldeEnDinars;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public float getSoldeEnDinars() {
        return soldeEnDinars;
    }

    public void setSoldeEnDinars(float soldeEnDinars) {
        this.soldeEnDinars = soldeEnDinars;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public Date getDateCreationCompte() {
        return dateCreationCompte;
    }

    public void setDateCreationCompte(Date dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }

    public String getOwnerCompte() {
        return ownerCompte;
    }

    public void setOwnerCompte(String ownerCompte) {
        this.ownerCompte = ownerCompte;
    }

    public double soldeEnEuros(float solde){
        return solde * 0.34123;
    }
}
