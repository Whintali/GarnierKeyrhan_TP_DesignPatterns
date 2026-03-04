package Builder.Example;

public class CafeBuilder {
    public String nom;
    public String origine;
    public String variete;
    public String niveauTorrefaction;
    public int temperatureTorrefaction;
    public String profil;
    public int acidite;
    public int amertume;
    public int corps;
    public double prix;
    public int quantiteStock;
    public String fournisseur;

    public CafeBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }
    
    public CafeBuilder setOrigine(String origine) {
        this.origine = origine;
        return this;
    }
    
    public CafeBuilder setVariete(String variete) {
        this.variete = variete;
        return this;
    }
    
    public CafeBuilder setNiveauTorrefaction(String niveauTorrefaction) {
        this.niveauTorrefaction = niveauTorrefaction;
        return this;
    }
    
    public CafeBuilder setTemperatureTorrefaction(int temperatureTorrefaction) {
        this.temperatureTorrefaction = temperatureTorrefaction;
        return this;
    }
    
    public CafeBuilder setProfil(String profil) {
        this.profil = profil;
        return this;
    }
    
    public CafeBuilder setAcidite(int acidite) {
        this.acidite = acidite;
        return this;
    }
    
    public CafeBuilder setAmertume(int amertume) {
        this.amertume = amertume;
        return this;
    }
    
    public CafeBuilder setCorps(int corps) {
        this.corps = corps;
        return this;
    }
    
    public CafeBuilder setPrix(double prix) {
        this.prix = prix;
        return this;
    }
    
    public CafeBuilder setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
        return this;
    }
    
    public CafeBuilder setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
        return this;
    }

    public CafeClass build() {
        return new CafeClass(this); // Crée l'objet Cafe
    }
}
