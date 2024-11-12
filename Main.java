import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main{
    public static void main (String[] args){
        System.out.println("This is java program");
        System.out.println("Practising jenkins");
        System.out.println("Data--?" + new Date());
        System.err.println("Added one more file to jenkins");

        Student s =  new Student();
         List<Student> list =   new ArrayList<>();

        s.sayHello();
        for(int i = 0 ; i< 10;i++){
            
            list.add(new Student("Pavan H Alagur", "Class"+i));
           }
   
   
           for (Student student : list) {
               System.out.println("StudentNAme -->" + student.getName()+"------ Class-->" + student.getClassName());
           }
        
        
    }
}