package fornitore;

import java.io.Serializable;

public class Ordine implements Serializable{
    
    private int quantita;
    private float valore;

    public Ordine(int quantita, float valore) {
        this.quantita = quantita;
        this.valore = valore;
    }

    public int getQuantita() {
        return quantita;
    }

    public float getValore() {
        return valore;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setValore(float valore) {
        this.valore = valore;
    }
   
}
