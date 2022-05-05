/*public class EHandling
{
    public static void main(String args[])
    {
     try{
        int[] myNumbers={1,2,3};
         System.out.println(myNumbers[10]);
     } catch(Exception e) {
         System.out.println("somethin is wrong");
     }
    }
    }

 */ //used finally blocked
/*public class EHandling
{
    public static void main(String []args)
    {
        try
        {
            int[] myNumbers={1,2,3};
            System.out.println(myNumbers[10]);
        }catch (Exception e)
        {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("The try catch is finished");
        }
    }
}
*/
// Use throw
public class EHandling
{
    static void checkAge(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Access denied -you must be at least 18 year old");
        }
        else{
            System.out.println("Access granted-you are old enough!");
        }
    }
    public  static void main(String args[])
    {
        checkAge(15);
    }
}



