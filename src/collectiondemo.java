import java.util.*;

public class collectiondemo {
    public static void main(String args[])
    {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>(5);
        arr2.add(23);
        arr2.add(20);
        arr2.add(22);

        arr1.add(2);
        arr1.add(3);
        arr1.add(0,1);
        arr1.add(5);
        arr1.add(3,4);
        arr1.addAll(0,arr2);
        //System.out.println(arr1.contains(4));
        System.out.println(arr1.lastIndexOf(4));
        arr1.set(5,766);
        //arr1.clear();
       for(int i=0;i< arr1.size();i++)
        {
            System.out.println(arr1.get(i));
        }
    }
}
