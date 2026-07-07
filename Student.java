public class Student {
    private final int id;
    private String name;
    private int age;
    private double marks;
    
    public Student(int id, String name, int age, double marks){
        if (id<=0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        this.id = id;

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;

        if (age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;

        if (marks<0 || marks>100) {
            throw new IllegalArgumentException("Marks should be between 0 to 100.");
        }
        this.marks = marks;
    }

    public int getId(){
        return id;
    }
    

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        if (marks<0 || marks>100) {
            throw new IllegalArgumentException("Marks should be between 0 to 100.");
        }
        this.marks = marks;
    }
    @Override
    public String toString(){
        return "-------------------------"+"\n"+"ID: " + id + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "Marks: " + marks + "\n" +"-------------------------"; 
       
    }

}

