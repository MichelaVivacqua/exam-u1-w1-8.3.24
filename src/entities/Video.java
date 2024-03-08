package entities;

import interfaces.Luminosita;
import interfaces.PlayAndVol;

public class Video extends ElementoMultimediale implements PlayAndVol, Luminosita {
    private int volume;
    private int durata;
    private int luminosita;

    @Override
    public String toString() {
        return "Video{" +
                "volume=" + volume +
                ", durata=" + durata +
                ", luminosita=" + luminosita +
                ", titolo='" + titolo + '\'' +
                '}';
    }

    public Video(String titolo, int volume, int durata, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita=luminosita;
    }




    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
        }
    }


    @Override
    public void play() {
        String titoloConVolumeLuminosita = getTitolo();
        for (int i = 0; i < volume; i++) {
            titoloConVolumeLuminosita += "!";
        }
        for (int i = 0; i < luminosita; i++) {
            titoloConVolumeLuminosita += "*";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println( titoloConVolumeLuminosita);
        }
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

}
