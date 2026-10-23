import java.util.*;

class program834
{
    public static void main(String A[])
    {
        ArrayList <String> aobj = new ArrayList<String>();

        aobj.add("pune");
        aobj.add("mumbai");
        aobj.add("satara");
        aobj.add("nashik");
        aobj.add("mumbai");

        if(aobj.contains("satara"))
        {
            System.out.println("Satara is present in array list");
        }
    }   
}