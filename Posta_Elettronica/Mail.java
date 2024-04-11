package Posta_Elettronica;

public class Mail{

    String mittente, oggetto, testo, informazioni;
    int data, ora;

    public Mail(String mittente, String oggetto, String testo, String informazioni, int data, int ora){
        this.mittente=mittente; this.oggetto=oggetto; this.testo=testo; this.informazioni=informazioni; this.data=data; this.ora=ora;
    }

    public void setMittente(String mittente){
        this.mittente=mittente;
    }
    public String getMittente(){
        return mittente;
    }

    public void setOggetto(String oggetto){
        this.oggetto=oggetto;
    }

    public String getOggetto(){
        return oggetto;
    }

    public void setTesto(String testo){
        this.testo=testo;
    }
    public String getTesto(){
        return testo;
    }

    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return data;
    }

    public void setOra(int ora){
        this.ora=ora;
    }
    public int getOra(){
        return ora;
    }

    @Override
    public String toString() {
        return "Mittente: "+mittente+", Informazioni: "+informazioni+", Oggetto: "+oggetto+", Data "+data+" : "+ora;
    }

}