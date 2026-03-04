package Builder.Example;

import java.util.UUID;

public class CafeClass {
    private String id;
    private String nom;
    private String origine;
    private String variete;
    
    private String niveauTorrefaction; 
    private int temperatureTorrefaction;
    
    private String profil;
    private int acidite; 
    private int amertume;
    private int corps; 
    
    private double prix;
    private int quantiteStock;
    private String fournisseur;

    public CafeClass(CafeBuilder builder){
        this.id = UUID.randomUUID().toString();
        this.nom = builder.nom;
        this.origine = builder.origine;
        this.variete = builder.variete;
        this.niveauTorrefaction = builder.niveauTorrefaction;
        this.temperatureTorrefaction = builder.temperatureTorrefaction;
        this.profil = builder.profil;
        this.acidite = builder.acidite;
        this.amertume = builder.amertume;
        this.corps = builder.corps;
        this.prix = builder.prix;
        this.quantiteStock = builder.quantiteStock;
        this.fournisseur = builder.fournisseur;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public double getPrix() {
        return prix;
    }

    public int getCorps() {
        return corps;
    }

    public int getAmertume() {
        return amertume;
    }

    public int getAcidite() {
        return acidite;
    }

    public String getProfil() {
        return profil;
    }

    public int getTemperatureTorrefaction() {
        return temperatureTorrefaction;
    }

    public String getNiveauTorrefaction() {
        return niveauTorrefaction;
    }

    public String getVariete() {
        return variete;
    }

    public String getOrigine() {
        return origine;
    }

    public String getNom() {
        return nom;
    }

    public String getId() {
        return id;
    }

    
}
