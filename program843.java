import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

class StudyLog
{
    public LocalDate date;
    public String Subject;
    public double Duration;
    public String Description;

    StudyLog(LocalDate a,String b,double c,String d)
    {
        this.date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    public String toString()
    {
        return date + " | " +Subject +" | "+ Duration + " | " + Description;
    }
}

class program843
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();

        StudyLog sobj1 = new StudyLog(lobj, "c_programming", 3.5, "pointers in c");
        StudyLog sobj2 = new StudyLog(lobj, "java_programming", 5.5, "inheritance in java");

        System.out.println(sobj1);
        System.out.println(sobj2);

    }   
}