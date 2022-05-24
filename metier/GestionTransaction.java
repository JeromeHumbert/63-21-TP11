package metier;

import domaine.*;

import java.util.ArrayList;

public class GestionTransaction {
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<Client> clients = new ArrayList<>();
    private static final int MONTANT_LIMITE = 200000;
    public GestionTransaction(){
        System.out.println("\n---------- Chargement des données ------------");
        chargerDonnees();
        System.out.println("\n---------- Affichage naturel ------------");
        trierPar("");
        affichage();
        trierPar("emetteur");
        System.out.println("\n---------- Affichage emetteur ------------");
        affichage();
        trierPar("recepteur");
        System.out.println("\n---------- Affichage recepteur ------------");
        affichage();
    }

    private void chargerDonnees(){

    }

    private void affichage(){

    }

    private void trierPar(String critere){

    }


}
