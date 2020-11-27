public class Student 
{
    String name;
    int rollNo;
    String className;
    
    Student(String name, int rollNo)
    {
        this.name = name;
        this. rollNo = rollNo;
    }
    
    Student(String name, int rollNo, String className)
    {
        this.name = name;
        this. rollNo = rollNo;
        this.className = className;
    }
    
    public void studentData()
    {
        System.out.println("Name of Student = " + name);
        System.out.println("Roll no = "+ rollNo);
        System.out.println("Class Name = "+ className);
    }
    
    public static void main (String arg[])
    {
        
        Student student1 = new Student("Ravi", 10 , "FE");
        student1.studentData();
        
        Student student2 = new Student("Ram", 2, "SE");
        student2.studentData();
        
    }    
}