import java.util.ArrayList;
import java.util.Iterator;
//  Program to traverse or iterate ArrayList
/*public class arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);

        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(6);
        l1.add(5);

 /* for(int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }*/
       /* Iterator<Integer> i=l1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}*/

//Convert ArrayList To String Array
/*public class arraylist
{
    public static void main(String args[])
    {
        ArrayList<String> asr=new ArrayList<>();
        asr.add("Hi");
        asr.add("hello");
        asr.add("how");
        asr.add("are");
        asr.add("you");
        asr.add("dear");

        String array[]=new String[asr.size()];
        for(int j=0;j<asr.size();j++)
        {
            array[j]=asr.get(j);
        }
        for(String k: array)
        {
            System.out.println(k);
        }
    }
} */
public class arraylist
{
    public static void main(String[]args)
    {
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("hi");
        arr1.add("hello");
        arr1.add("Khana");
        arr1.add("khake");
        arr1.add("jana");
        arr1.add("hhhh");
        String array[]=new String[arr1.size()];
        for(int j=0;j<arr1.size();j++)
        {
            array[j]=arr1.get(j);
        }
        for(String k:array)
        {
            System.out.println(k);
        }
    }
}