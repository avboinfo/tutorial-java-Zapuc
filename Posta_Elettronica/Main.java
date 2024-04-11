package Posta_Elettronica;

public class Main {
    public static void main(String[] args){
        Mailbox emailManager = new Mailbox();

        emailManager.riceviEmail("francescohulboceanu@gmail.com", "Oggetto 1", "Info 1", "Ciao",22,24);
        emailManager.riceviEmail("sandro.gallo@avbo.it", "Oggetto 2", "Info 2", "Come stai", 21, 23);

        System.out.println("Email ricevute:");
        emailManager.stampaListaEmail();

        emailManager.eliminaEmail(1);

        System.out.println("\nEmail dopo eliminazione:");
        emailManager.stampaListaEmail();

        System.out.println();
        emailManager.ricercaOggetto("Oggetto1");
    }
}
