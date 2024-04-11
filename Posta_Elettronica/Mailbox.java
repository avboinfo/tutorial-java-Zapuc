package Posta_Elettronica;
import java.util.ArrayList;
import java.util.List;

public class Mailbox {
    private List<Mail> listaEmail = new ArrayList<>();

    public void riceviEmail(String mittente, String oggetto, String testo, String informazioni, int data, int ora) {
        Mail email = new Mail(mittente, oggetto, testo, informazioni, data, ora);
        listaEmail.add(0, email); // Aggiunge l'email in cima alla lista
    }

    public void eliminaEmail(int posizione) {
        if (posizione >= 0 && posizione < listaEmail.size()) {
            listaEmail.remove(posizione);
        } else {
            System.out.println("Posizione non valida");
        }
    }

    public void ricercaOggetto(String oggetto) {
        for (Mail email : listaEmail) {
            if (email.getOggetto().contains(oggetto)) {
                System.out.println("Email trovata: " + email);
                return;
            }
        }
        System.out.println("Nessuna email con l'oggetto specificato trovata");
    }

    public void stampaListaEmail() {
        for (Mail email : listaEmail) {
            System.out.println(email);
        }
    }
    
}