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

        aobj.remove(4);

        for(String str : aobj)
        {
            System.out.println(str);
        }

        aobj.clear();

        System.out.println(aobj);
    }   
}