package entities;

import interfaces.PlayAndVol;

public class Audio extends ElementoMultimediale implements PlayAndVol {
    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
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
    public String toString() {
        return "Audio{" +
                "volume=" + volume +
                ", durata=" + durata +
                ", titolo='" + titolo + '\'' +
                '}';
    }

    @Override
    public void play() {
        String titoloConVolume = getTitolo();
        for (int i = 0; i < volume; i++) {
            titoloConVolume += "!";
        }
        for (int i = 0; i < durata; i++) {
            System.out.println("Riproducendo: " + titoloConVolume);
        }
    }

}
