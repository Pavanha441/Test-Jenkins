public class Student {

    private String name;
    private String className;

    public Student() {
        System.out.println("Creating a student object");
    }

    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public void sayHello() {
        System.out.println("Hi Jenkins from students");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }

}