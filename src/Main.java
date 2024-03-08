import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        I miei tentativi per testare il corretto funzionamento del codice
//        prima dell'implementazione dello scanner:
//
//        Audio nonDirgliMai = new Audio("Non dirgli mai", 5, 3);
//
//        nonDirgliMai.play();
//
//        System.out.println("---------------");
//        nonDirgliMai.abbassaVolume();
//        nonDirgliMai.play();
//        System.out.println("---------------");
//        nonDirgliMai.alzaVolume();
//        nonDirgliMai.alzaVolume();
//        nonDirgliMai.play();
//
//        Video spotPubblicitario = new Video("Spot pubblicitario Coca Cola", 2, 2,3);
//
//        spotPubblicitario.play();
//
//        System.out.println("---------------");
//        spotPubblicitario.abbassaVolume();
//        spotPubblicitario.play();
//        System.out.println("---------------");
//        spotPubblicitario.alzaVolume();
//        spotPubblicitario.alzaVolume();
//        spotPubblicitario.alzaVolume();
//        spotPubblicitario.play();
//        System.out.println("---------------");
//        spotPubblicitario.diminuisciLuminosita();
//        spotPubblicitario.play();
//        System.out.println("---------------");
//        spotPubblicitario.aumentaLuminosita();
//        spotPubblicitario.play();
//
//        Immagine fotomia = new Immagine("La mia foto",5);
//        fotomia.show();
//        System.out.println("---------------");
//        fotomia.aumentaLuminosita();
//        fotomia.aumentaLuminosita();
//        fotomia.show();
//        System.out.println("---------------");
//        fotomia.diminuisciLuminosita();
//        fotomia.show();

        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] mediaArray = new ElementoMultimediale[5];

        // Creo il primo elemento dell'array che sarà un audio
        for (int i = 0; i < 1; i++) {
            System.out.println("Ciao! Qui creeremo il quadro interattivo PLAYER con la canzone, due immagini, e due video della tua vacanza: Inserisci il titolo dell'audio che vuoi che sia riprodotto dal tuo quadro:");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata dell'audio:");
            int durata = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci il volume dell'audio");
            int volume = Integer.parseInt(scanner.nextLine());
            mediaArray[i] = new Audio(titolo, volume, durata);
        }

        // Creo il secondo e terzo elemento dell'array, che saranno 2 video
        for (int i = 1; i < 3; i++) {
            System.out.println("Inserisci il titolo del video: ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata del video: ");
            int durata = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci la luminosita del video: ");
            int luminosita = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci il volume del video: ");
            int volume = Integer.parseInt(scanner.nextLine());
            mediaArray[i] = new Video(titolo, volume, durata, luminosita);
        }

        //  Creo gli ultimi due elementi dell'array che saranno due immagini
        for (int i = 3; i < 5; i++) {
            System.out.println("Inserisci il titolo dell'immagine : ");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la luminosita dell'immagine: ");
            int luminosita = Integer.parseInt(scanner.nextLine());
            mediaArray[i] = new Immagine(titolo, luminosita);
        }


//        Test per il corretto funzionamento della creazione dell'array con i valori letti da tastiera
//        System.out.println("Media inseriti:");
//        for (ElementoMultimediale media : mediaArray) {
//            System.out.println(media);
//        }
//    }}


        String input;
        do {
            System.out.println("Premi 1 per riprodurre l'audio caricato, 2 per riprodurre il primo video caricato, 3 per riprodurre il secondo video caricato, 4 per mostrare la prima foto caricata, e 5 mostare la seconda foto caricata. O premi 0 per uscire");

            input = scanner.nextLine();

            switch (input) {
//              CAST ESPLICITO PER CONVERTIRE L'ELEMENTO DI TIPO ELEMENTOMULTIMEDIALE
//              (NECESSARIO A CREARE UN ARRAY UNICO SFRUTTANDO IL POLIMORFISMO)
//              IN UN ELEMENTO DI TIPO AUDIO
//              (LA CORRETTA SOTTOCLASSE) E POTER QUINDI USARE IL SUO METODO PLAY
                case "1":
                    ((Audio) mediaArray[0]).play();
                    System.out.println("Premi 1+ se vuoi alzare il volume, o 1- per abbassarlo");
                    break;
                case "1+":
                    ((Audio) mediaArray[0]).alzaVolume();
                    ((Audio) mediaArray[0]).play();
                    break;
                case "1-":
                    ((Audio) mediaArray[0]).abbassaVolume();
                    ((Audio) mediaArray[0]).play();
                    break;
                case "2": ((Video) mediaArray[1]).play();
                    System.out.println("Premi 2+ se vuoi alzare il volume, o 2- per abbassarlo; 2l+ se vuoi aumentare la luminosità e 2l- per abbassarla");break;
                case "2+":
                    ((Video) mediaArray[1]).alzaVolume();
                    ((Video) mediaArray[1]).play();
                    break;
                case "2-":
                    ((Video) mediaArray[1]).abbassaVolume();
                    ((Video) mediaArray[1]).play();
                    break;
                case "2l+":
                    ((Video)mediaArray[1]).aumentaLuminosita();
                    ((Video) mediaArray[1]).play();
                    break;
                case "2l-":
                    ((Video)mediaArray[1]).diminuisciLuminosita();
                    ((Video) mediaArray[1]).play();
                    break;
                case "3": ((Video) mediaArray[2]).play();
                    System.out.println("Premi 3+ se vuoi alzare il volume, o 3- per abbassarlo; 3l+ se vuoi aumentare la luminosità e 3l- per abbassarla");break;
                case "3+":
                    ((Video) mediaArray[2]).alzaVolume();
                    ((Video) mediaArray[2]).play();
                    break;
                case "3-":
                    ((Video) mediaArray[2]).abbassaVolume();
                    ((Video) mediaArray[2]).play();
                    break;
                case "3l+":
                    ((Video)mediaArray[2]).aumentaLuminosita();
                    ((Video) mediaArray[2]).play();
                    break;
                case "3l-":
                    ((Video)mediaArray[2]).diminuisciLuminosita();
                    ((Video) mediaArray[2]).play();
                    break;
                case "4": ((Immagine) mediaArray[3]).show();
                    System.out.println("Premi 4l+ se vuoi aumentare la luminosità e 4l- per abbassarla");break;
                case "4l+":
                    ((Immagine)mediaArray[3]).aumentaLuminosita();
                    ((Immagine) mediaArray[3]).show();
                    break;
                case "4l-":
                    ((Immagine)mediaArray[3]).diminuisciLuminosita();
                    ((Immagine) mediaArray[3]).show();
                    break;
                case "5": ((Immagine) mediaArray[4]).show();
                    System.out.println("Premi 5l+ se vuoi aumentare la luminosità e 5l- per abbassarla");break;
                case "5l+":
                    ((Immagine)mediaArray[4]).aumentaLuminosita();
                    ((Immagine) mediaArray[4]).show();
                    break;
                case "5l-":
                    ((Immagine)mediaArray[4]).diminuisciLuminosita();
                    ((Immagine) mediaArray[4]).show();
                    break;
                default:
                    System.out.println("Puoi selezionare un numero da 1 a 5 per il controllo dei tuoi file o 0 per uscire");
            }
        } while (!input.equals("0"));


        scanner.close();
    }

}
