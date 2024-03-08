package entities;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private int luminosita;
    public Immagine(String titolo,int luminosita) {
        super(titolo);
        this.luminosita=luminosita;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }


    @Override
    public void aumentaLuminosita() {
        if (luminosita < 10) {
            luminosita++;
        }
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "luminosita=" + luminosita +
                ", titolo='" + titolo + '\'' +
                '}';
    }

    public void show() {
        String titoloConLum = getTitolo();
        for (int i = 0; i < luminosita; i++) {
            titoloConLum += "*";

        }
        System.out.println("Visualizzando: " + titoloConLum);
    }
}
