package arresto;

import java.io.Serializable;

public class MessageWrapper implements Serializable {
    private Integer id;
    private Integer variazioneReati;
    private Integer variazioneTatuaggi;

    public MessageWrapper(Integer id, Integer variazioneReati, Integer variazioneTatuaggi) {
        this.id = id;
        this.variazioneReati = variazioneReati;
        this.variazioneTatuaggi = variazioneTatuaggi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVariazioneReati() {
        return variazioneReati;
    }

    public void setVariazioneReati(Integer variazioneReati) {
        this.variazioneReati = variazioneReati;
    }

    public Integer getVariazioneTatuaggi() {
        return variazioneTatuaggi;
    }

    public void setVariazioneTatuaggi(Integer variazioneTatuaggi) {
        this.variazioneTatuaggi = variazioneTatuaggi;
    }
    
    
}
