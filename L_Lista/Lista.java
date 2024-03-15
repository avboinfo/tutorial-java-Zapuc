package L_Lista;

import java.util.Iterator;

public class Lista {

    Nodo radice;

    class Iteratore{
        private Nodo nodo;  

        private Iteratore(Nodo nodo){
            this.nodo=nodo;
        }
        public boolean hasNext(){
            return nodo!=null;
        }
        public Nodo next(){
            if(nodo==null) return null;
            //Nodo result = new Nodo(nodo.getValore(),nodo.getSuccessivo());
            Nodo result=nodo;
            nodo=nodo.getSuccessivo();
            return result;
        }
    }

     public Iteratore getIterator(){
            Iteratore i=new Iteratore(radice);
            return i;
    }

    public Lista(){
        radice=null;
    }

    public boolean isEmpty(){
        return radice==null;
    }

    /* 
    public void add(Nodo n){
        if(isEmpty()){
            radice=n;
        }else{
            Nodo p=radice;
            while(p.getSuccessivo()!=null) p=p.getSuccessivo();
            p.setSuccessivo(n);
        }

    }*/

    public void addHead(Nodo n){
        if(isEmpty()){
            radice=n;
        }else{
            n.setSuccessivo(radice);
            radice=n;
        }
    }

    public void addSorted(Nodo n){
        if(isEmpty()){radice=n; n.setSuccessivo(null); return; } 
        int vn=n.getValore();
        if(vn<radice.getValore()){n.setSuccessivo(radice); radice=n; return;}
        Nodo p1=radice;
        Nodo p2=radice.getSuccessivo();
        while(p2!=null&&vn>p2.getValore()){
            p1=p2;
            p2=p1.getSuccessivo();
            }
        n.setSuccessivo(p2);
        p1.setSuccessivo(n);
        }
    
        /*
    public boolean addAfter(Nodo n, int pos){
        Nodo s=radice;
        int i=0;
        if(isEmpty()){ return false;}
        if(pos==0||pos<0||pos>grandezzaNodo){ return false;}
        while (s != null) {
            if (i == pos) {
                
                //SOLO PER GLI INTERI (proverò a farlo)
                    A=10, B=1;
                    A=A+B ( A=11, B=1 )
                    B=A-B ( A=11, B=10 )
                    A=A-B ( A=1 , B=10 )
                 
                Nodo s2 = s.getSuccessivo();
                s.setSuccessivo(n);
                n.setSuccessivo(s2);
                return true;
            }
            i++;
            s = s.getSuccessivo();
        }
        return false;
    }
    */

    public boolean addAfter(int pos, Nodo n){
        //aggiunge il nodo n solo dopo aver oltrepassato il nodo di indice pos
        Iteratore iter=this.getIterator();
        int i; Nodo npos=null;
        for(i=0;i<pos;i++){
            if(iter.hasNext())npos=iter.next();
            else return false;        
        }
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;
    }

    //rimuove il valore nella posizione
    public boolean removeValue(int pos){
        if(isEmpty()){ return false; }
        if(pos < 0) return false;

        if(pos==0){ return true; 
        }else{


        }




        return true;
    }

    //rimuove un nodo nella posizione 
    /*
    public boolean removePos(int pos){

    }
    */
 
    public String toString(){
        if(isEmpty()) return "Lista vuota";
        String s="Elementi della lista --> ";
        Nodo p=radice;
        while(p!=null){
            s+=p+"\t";
            p=p.getSuccessivo();
        }
        
        s+="End!\n";
        return s;
    }
}
