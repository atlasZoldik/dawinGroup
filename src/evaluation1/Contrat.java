/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluation1;

/**
 *
 * @author Ifiag
 */
public class Contrat implements iContrat
{
private Entreprise fournisseur;
private Entreprise client;

    public Contrat(Entreprise client, Entreprise fournisseur) {
        this.client =new  Entreprise(client);
        this.fournisseur = new Entreprise(fournisseur);
    }

     public Contrat(String code1 , String raisonSociale1,String code2 , String raisonSociale2) 
     {
        this.client = new Entreprise(code1,raisonSociale1);
        this.fournisseur = new Entreprise(code2,raisonSociale2);
        
        
    }

    @Override
    public String getcodeclient() {
        return client.getCode();
    }

    @Override
    public String getcodefournisseur() {
     return client.getRaisonSociale();
    }
    
    
    public String Tostring()
    {
    return ("Le client est :"+this.client+"le fournisseur est :"+this.fournisseur);
    }
    
    
    
    @Override
    public boolean equals(Object obj)
    {
        Contrat co =(Contrat)obj;
       if(this.client.equals(co.client) && this.fournisseur.equals(co.fournisseur))
       {
        return true;}
       else
       {
           return false;}
       }
    
    }



