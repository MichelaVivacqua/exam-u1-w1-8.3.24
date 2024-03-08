package entities;

import interfaces.PlayAndVol;

public class Video extends ElementoMultimediale implements PlayAndVol {
    private int volume;
    private int durata;
    private int luminosita;

    public Video(String titolo, int volume, int durata, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita=luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
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
            System.out.println("Playing: " + titoloConVolumeLuminosita);
        }
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
           luminosita--;
        }
    }


    public void aumentaLuminosita() {
        if (luminosita < 10) {
            luminosita++;
        }
    }

}
