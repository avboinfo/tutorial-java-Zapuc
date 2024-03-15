package L_Lista;

public class Main {
    public static void main(String[] argv){
        System.out.println("\n\nPartiti!\n\n");

        Lista l=new Lista();
        System.out.println(l);

        l.addSorted(new Nodo(200,null));
        l.addSorted(new Nodo(250,null));
        l.addSorted(new Nodo(100,null));
        l.addSorted(new Nodo(150,null));

        System.out.println(l);

        l.addAfter(130, new Nodo(130, null));

        /* 
        Lista.Iteratore iter=l.getIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        */


}
}