/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fichiersjava;

/**
 *
 * @author cbarthel01
 */
public class Batiment {
    
    private int idBatiment;
    private String typeBatiment;
    private int nbreNiveaux;

    public Batiment(int idBatiment, String typeBatiment, int nbreNiveaux) {
        this.idBatiment = idBatiment;
        this.typeBatiment = typeBatiment;
        this.nbreNiveaux = nbreNiveaux;
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public String getTypeBatiment() {
        return typeBatiment;
    }

    public void setTypeBatiment(String typeBatiment) {
        this.typeBatiment = typeBatiment;
    }

    public int getNbreNiveaux() {
        return nbreNiveaux;
    }

    public void setNbreNiveaux(int nbreNiveaux) {
        this.nbreNiveaux = nbreNiveaux;
    }
    
    
}
