package ws;

import java.time.LocalDate;

public class Compte {
    private int code;
    private double solde;
    private LocalDate dateCreation;

    public Compte(int code, double solde, LocalDate dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
}
