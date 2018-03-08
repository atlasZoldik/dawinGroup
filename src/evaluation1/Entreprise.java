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
public class Entreprise {
    private String code;
   private String raisonSociale;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
   
   
    public Entreprise(String code1, String raisonSociale1,String code2, String raisonSociale2) {
        this.code = new Entreprise(code1,raisonSociale1);
        this.raisonSociale = new Entreprise(code2,raisonSociale2);
    }
 
    
     public Entreprise(Entreprise entreprise) {
        this.code =entreprise.code;
        this.raisonSociale = entreprise.raisonSociale;
    }
 
     //@Override
    public String Tostring()
    {
       return ("Le cod eest :"+this.code+"le raison sociale est :"+this.raisonSociale);
    }
    
    @Override
    
    public boolean equals(Object obj)
    {
        Entreprise ent =(Entreprise)obj;
        if(this.code.equals(ent.code))
     return true;
        else
            return false;
    
    }

   
    
    
    
    
    }
    
   
    

