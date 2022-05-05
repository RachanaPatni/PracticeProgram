import java.util.ArrayList;

//creat anonymous class
/*
public class Streamapi
{
    public  static void main(String[] args)
    {
        //anonymous
        new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println("I just implements");
            }
        })).start();
    }
} */
//Crateing Lambda expression
/*public class Streamapi
{
    public static void main(String args[])
    {
        ArrayList<Integer> aar1=new ArrayList<Integer>();
        aar1.add(1);
        aar1.add(2);
        aar1.add(5);
        aar1.add(6);
        System.out.println(aar1);
        aar1.forEach((n) -> {System.out.println(n);});

    }
} */
//use consumer interface
/*import java.util.function.Consumer;
public class Streamapi
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        arr1.add(4);
        arr1.add(5);
        arr1.add(7);
        arr1.add(9);
        arr1.add(2);
        Consumer<Integer> method=(n) ->{System.out.println(n);};
        arr1.forEach(method);


    }
} */

