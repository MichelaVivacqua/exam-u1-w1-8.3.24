import entities.Audio;
import entities.Video;

public class Main {
    public static void main(String[] args) {


        Audio nonDirgliMai = new Audio("Non dirgli mai", 5, 3);

nonDirgliMai.play();

System.out.println("---------------");
nonDirgliMai.abbassaVolume();
nonDirgliMai.play();
        System.out.println("---------------");
        nonDirgliMai.alzaVolume();
        nonDirgliMai.alzaVolume();
        nonDirgliMai.play();

        Video spotPubblicitario = new Video("Spot pubblicitario Coca Cola", 2, 2,3);

        spotPubblicitario.play();

        System.out.println("---------------");
       spotPubblicitario.abbassaVolume();
        spotPubblicitario.play();
        System.out.println("---------------");
        spotPubblicitario.alzaVolume();
        spotPubblicitario.alzaVolume();
        spotPubblicitario.alzaVolume();
        spotPubblicitario.play();
        System.out.println("---------------");
        spotPubblicitario.diminuisciLuminosita();
        spotPubblicitario.play();
        System.out.println("---------------");
        spotPubblicitario.aumentaLuminosita();
        spotPubblicitario.play();
    }
}
