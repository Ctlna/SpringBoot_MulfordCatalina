package EjComponenete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gato implements SerVivo {
    @Autowired
    private Personita esclavo;

    public Gato(Personita esclavo) {
        this.esclavo = esclavo;
    }

    public Personita getEsclavo() {
        return esclavo;
    }

    @Override
    public String caminar() {
        return "El gato camina en 4 patas";
    }
}
