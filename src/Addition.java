/*public  class Addition {
    public static void main(String [] args)
    {
        int[] arr1=new int[]{1,4,6,8};
        int[] arr2=new int[]{1,3,6,8};
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0; j< arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    sum=sum+arr2[j];
                }
            }
        }
        System.out.println(sum);
    }
}*/

import java.sql.SQLOutput;

//copy elements of one array to another

 /* public class Addition {
    public  static void main(String [] args)
    {
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[arr1.length];
         for(int i=0;i< arr1.length;i++)

         {
             arr2[i]=arr1[i];
         }
         for(int elements:arr2)
         {
             System.out.println(elements);
         }
     }
}


public class Addition
{
    public static void main(String args[])
    {
        int[] arr1=new int[]{1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        for (int i=0;i< arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
        for(int elements:arr2)
        {
            System.out.println(elements);
        }
    }
}

  */

// program to print same elements of array
/*
 public class Addition {
     public static void main(String args[])
     {
         int[] arr1=new int[]{1,3,5,7,9};
         int[] arr2=new int[]{1,2,5,7,9};
         for(int i=0; i< arr1.length;i++)
         {
             for(int j=0;j< arr2.length;j++)
             {
                 if(arr1[i]==arr2[j])
                 {
                     System.out.println(arr2[j]);
                 }
             }
         }
     }
}
 */


// array in ulta order
/*
public class Addition{
    public static void main(String args[])
    {
       int[] arr1=new int[]{1,2,3,4,5,6};
        System.out.println(" ulta order");
       for(int i= arr1.length-1;i>=0;i--)
       {

           System.out.println(arr1[i]);
       }
    }
}
*/


//print the odd positon elements
/*
public  class Addition {
    public static void main(String args[])
    {
            int[] arr1=new int[]{1,2,3,4,5,6,7,8};
            for(int i=0; i< arr1.length;i=i+2)
            {
                System.out.println(arr1[i]);
            }
    }
}
*/
//print the even positon elements
/*
public  class Addition {
    public static void main(String args[])
    {
            int[] arr1=new int[]{1,2,3,4,5,6,7,8};

          for(int i=1;i< arr1.length;i=i+2)
            {
                System.out.println(arr1[i]);
            }
    }
}
*/

//sort array
/*
public class Addition
 {
    public static void main(String args[])
    {
        int[]arr1=new int[]{1,2,3,4,5,6,7,9};
        int temp=0;
        for(int i=0;i< arr1.length;i++)
        {
            for(int j=0;j< arr1.length;i++)
            {
                if(arr1[i]>arr1[j])
                {
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;

                }
            }
            System.out.println(arr1[i]+"");
        }
    }
}
*/
// program to print same elements of array
public class Addition {
    public static void main(String args[])
    {
        int[] arr1=new int[]{1,3,5,7,9};
        int[] arr2=new int[]{1,2,5,7,9};
        for(int i=0; i< arr1.length;i++)
        {
            for(int j=0;j< arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}