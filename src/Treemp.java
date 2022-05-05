import java.util.*;

/*public class Treemp
{
    public static void main(String args[])
    {
        TreeMap<String,String> treemp=new TreeMap<String,String>();
        treemp.put("k1","yes");
        treemp.put("k2","no");
        treemp.put("k3","both");

        Set set=treemp.entrySet();
        Iterator it=set.iterator();

        System.out.println("Tree contains");
        while(it.hasNext())
        {
            Map.Entry pair=(Map.Entry)it.next();
            System.out.print("key is :"+pair.getKey()+" and ");
            System.out.println("value is :"+pair.getValue());
        }
  }
}
*/

public class Treemp
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hmp=new HashMap<Integer,String>();
        hmp.put(1,"shichan");
        hmp.put(2,"shizuka");
        hmp.put(3,"Nobita");
        hmp.put(4,"Masao");

        System.out.println(hmp);
        //remove
        Object removedElement1=hmp.remove(3);
        System.out.println("element removed is:" + removedElement1);

        //after remove elements
        System.out.println(hmp);
    }
}
