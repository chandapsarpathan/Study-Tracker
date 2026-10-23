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

    @Override
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

class program849
{
    public static void main(String A[])
    {
        LocalDate lobj = LocalDate.now();

        ArrayList <StudyLog> Database = new ArrayList<StudyLog>();

        StudyLog sobj1 = new StudyLog(lobj, "c_programming", 3.5, "pointers in c");

        StudyLog sobj2 = new StudyLog(lobj, "c++_programming", 3.5, "pointers in c");

        StudyLog sobj3 = new StudyLog(lobj, "java_programming", 3.5, "pointers in c");

        Database.add(sobj1);
        Database.add(sobj2);
        Database.add(sobj3);

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }

        Database.remove(1);

        System.out.println("After removal:");

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }
    }   
}