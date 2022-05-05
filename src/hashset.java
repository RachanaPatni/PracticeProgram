import java.util.HashSet;
import java.util.Iterator;
//Iterate HashSet  Using Iterator
/*public class hashset
{
    public static void main(String args[])
    {
        HashSet<String> hst=new HashSet<String>();
        hst.add("nobita");
        hst.add("shinchan");
        hst.add("Doremon");
        hst.add("ninjahatodi");
        hst.add("mickymouse");
        hst.add("ksama");

        Iterator<String> it=hst.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}*/
//  Iterate HashSet using for each loop
/*public class hashset
{
    public static void main(String args[])
    {
        HashSet<String> hst=new HashSet<String>();
        hst.add("emli");
        hst.add("alia");
        hst.add("Hala");
        hst.add("Haza");
        hst.add("chanda");

        for(String str:hst)
        {
            System.out.println(str);
        }
    }
}*/
// Find the same Value in both set
public class hashset
{
    public static void main(String []args)
    {
        HashSet<String>hs=new HashSet<String>();
        hs.add("s1");
        hs.add("s2");
        hs.add("first");
        hs.add("second");
        hs.add("last");
        System.out.println(hs);

        HashSet<String> hst=new HashSet<String>();
        hst.add("a1");
        hst.add("b1");
        hst.add("first");
        hst.add("last");
        hst.add("c1");
        System.out.println(hst);

        hs.retainAll(hst);
        System.out.println(hs);
    }
}


