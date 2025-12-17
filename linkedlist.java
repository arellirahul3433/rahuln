import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        for(int i=0;i< 10 ;i++){
            System.out.print(list.get(i)+" ");
        }
        list.addFirst(1000);
        System.out.println();
        for(int i=0;i< 10;i++){
            System.out.print(list.get(i)+" ");
        }
    
}
}
