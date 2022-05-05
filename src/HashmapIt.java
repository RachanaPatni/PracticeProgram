import java.util.*;

/*public class HashmapIt
{
        public static void main(String[] args){
            HashMap<Integer,String> newHash = new HashMap<Integer,String>();
            newHash.put(1,"Ashish");
            newHash.put(2,"Bhagyashree");
            newHash.put(3,"Rachana");
            newHash.put(4,"krushna");
            newHash.put(5,"Harsh");

         /*Iterator itr = newHash.entrySet().iterator();
           while(itr.hasNext()) {
                Map.Entry<Integer, String> map = (Map.Entry) itr.next();
                System.out.println(map.getKey()+" "+map.getValue());
            }*/


            /*Iterator itr=newHash.entrySet().iterator();
            while(itr.hasNext())
            {
                Map.Entry<Integer,String> map=(Map.Entry) itr.next();
                System.out.println(map.getKey()+" "+map.getValue());
            }


        }
             */
//synchronize Hasmap
public class HashmapIt
{
    public static void main(String args[])
    {
        HashMap<Integer, String> hmp = new HashMap<Integer, String>();
        hmp.put(1, "Chiku");
        hmp.put(2, "Mittu");
        hmp.put(3, "santu");
        hmp.put(4, "chanchal");
        Map map = Collections.synchronizedMap(hmp);
        Set set = map.entrySet();
        synchronized (map)
        {
            Iterator i = set.iterator();
            while (i.hasNext())
            {
                Map.Entry pair = (Map.Entry) i.next();
                System.out.print(pair.getKey()+": ");
                System.out.println(pair.getValue());
            }
        }
    }

}