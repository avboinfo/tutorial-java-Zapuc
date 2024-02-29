package L_Lista;

import java.io.*;

public class Nodo{

    private int valore;
    private Nodo successivo;

    public Nodo (int valore, Nodo successivo) {
        this.valore=valore;
        this.successivo=successivo;
    }

    public void setSuccessivo(Nodo nuovoSuccessivo){
        successivo=nuovoSuccessivo;
    }

    public Nodo getSuccessivo(){
        return successivo;
    }

    public int getValore(){
        return valore;
    }

    public void setValore(int nuovoValore){
        valore=nuovoValore;
    }

    public String toString(){
        return "["+valore+"]";
    }
}