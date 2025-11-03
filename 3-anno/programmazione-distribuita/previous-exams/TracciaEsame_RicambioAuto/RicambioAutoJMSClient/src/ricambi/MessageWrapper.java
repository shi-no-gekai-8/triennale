package ricambi;

import java.io.Serializable;

public class MessageWrapper implements Serializable{
    int id;
    int pezzi_venduti;

    public MessageWrapper(int id, int pezzi_venduti) {
        this.id = id;
        this.pezzi_venduti = pezzi_venduti;
    }

    public int getId() {
        return id;
    }

    public int getPezzi_venduti() {
        return pezzi_venduti;
    }
    
    
}
