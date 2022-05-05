import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*public class Hashmp
{
    public static void main(String args[])
    {
        HashMap<String,String> hmp =new HashMap<String,String>();
        hmp.put("1","Rachana");
        hmp.put("2","Bhagyshri");
        hmp.put("3","Sunidhi");
        hmp.put("4","Ashish");
        hmp.put("5","Manchan");

       /* System.out.println(hmp);
        System.out.println(hmp.size());
        System.out.println(hmp.isEmpty());
        */
        //Iterating using keyset() method
        /*for(String Key: hmp.keySet())
        {
            System.out.println("key: "+Key+" value: " +hmp.get(Key));
        } */
        /*Set<String> keySet=hmp.keySet();
        Iterator<String> itr=keySet.iterator();
        while (itr.hasNext())
        {
            String key=itr.next();
            System.out.println("key-> "+key+ " vlaue-> "+ hmp.get(key));
        }

    }
}
*/

/*public  class Hashmp
{
  public static void main(String args[])
  {
      HashMap<Integer,String> hmp=new HashMap<Integer,String>();
      HashMap<Integer,String> hmp1=new HashMap<Integer,String>();
       hmp.put(1,"RRR");
       hmp.put(2,"RRR");
    //  System.out.println(hmp);
      hmp1.put(3,"Rtv");
      hmp1.put(4,"sst");
     // System.out.println(hmp1);

      hmp1.putAll((hmp));
    //  System.out.println(hmp1);
     Iterator itr = hmp.entrySet().iterator();
     while(itr.hasNext()){
         Map.Entry<Integer,String> map = (Map.Entry)itr.next();
         System.out.println(map.getKey()+" "+map.getValue());
     }

  }
}

 */
// serialization of Hashmap
import java.util.*;
import java.io.*;

/*public class Hashmp
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hmp=new HashMap<Integer,String>();
        hmp.put(1,"Na");
        hmp.put(2,"jaa");
        hmp.put(3,"jaa");

        try{
            FileOutputStream fos=new FileOutputStream("hmp.ser");
            ObjectOutput oos=new ObjectOutputStream(fos);
            oos.writeObject(hmp);
            oos.close();
            fos.close();
            System.out.println("Serialized hashmap data is saved in hashmap .ser");
        }catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
 */
//Deserialization of hashmap
/*
public class Hashmp
{
    public static void main(String agrs[])
    {
        HashMap<Integer,String> hmp=new HashMap<Integer,String>();
        try {
            FileInputStream fis=new FileInputStream("hmp.ser");
            ObjectInputStream iis=new ObjectInputStream(fis);
            hmp=(HashMap)iis.readObject();
            iis.close();
            iis.close();
        }catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Hashmap");
        Set set=hmp.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry mentry=(Map.Entry)iterator.next();
            System.out.println("key: "+mentry.getKey()+"& Value:");
            System.out.println(mentry.getValue());
        }

    }
}
*/


