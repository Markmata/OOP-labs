package mainlinked;

import linked.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.remove();
        System.out.println(list);

        list.remove();
        System.out.println(list);
    }
}