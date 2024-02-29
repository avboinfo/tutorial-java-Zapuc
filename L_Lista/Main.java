package L_Lista;

public class Main {
    public static void main(String[] argv){
        System.out.println("Partiti!\n\n");

        Lista l=new Lista();
        System.out.println(l);

        //Nodo n=new Nodo(100, null);

        l.add(new Nodo(100,null));
        l.add(new Nodo(101,null));
        l.add(new Nodo(102,null));
        l.add(new Nodo(103,null));
        l.add(new Nodo(104,null));
        System.out.println(l);
    }
}
