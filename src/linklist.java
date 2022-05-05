import java.util.LinkedList;

public class linklist {

    public static void main(String args[])
    {
        LinkedList<Integer> lik1=new LinkedList<>();
        lik1.add(1);
        lik1.add(2);
        lik1.add(4);
        lik1.add(6);
        lik1.add(8);
        lik1.addLast(9 );

        for(int i=0;i<lik1.size();i++)
        {
            System.out.println(lik1.get(i));
        }
    }
}

