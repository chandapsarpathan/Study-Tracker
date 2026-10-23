import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

class StudyLog
{
    private LocalDate date;
    private String Subject;
    private double Duration;
    private String Description;

    public StudyLog(LocalDate a,String b,double c,String d)
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

    public LocalDate getDate()
    {
        return this.date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }
}

class program844
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();

        StudyLog sobj1 = new StudyLog(lobj, "c_programming", 3.5, "pointers in c");

        System.out.println(sobj1);

        System.out.println(sobj1.getDate());

        System.out.println(sobj1.getSubject());

        System.out.println(sobj1.getDuration());

        System.out.println(sobj1.getDescription());
    }   
}