

class Student{
    // These are data | data members | instance variable
    int studentId;
    String studentName;
    String studentCity;

    // creating constructor
    // this is constructor overloading
    public Student(String name, int id){
        // When you pass zero parameter then this constructor will be called
        System.out.println("Creating Object with non-parameterized "+name + id);
    }
    public Student(int id, String name){
        // When an int paramter is passed then this construtor will be called
        System.out.println("Creating object with parameter"+ id + name);
    }

    // methods or functions 
    public void study(){
        System.out.println(studentName+" is studying");
    }
    public void showFullDetails(){
        System.out.println("My name is "+studentName);
        System.out.println("My city is "+studentCity);
        System.out.println("My id is "+studentId);
    }

    public static void main(String args[]){
        Student s1 = new Student("Suraj", 24);
        s1.studentName = "Suraj";
        s1.studentId=133;
        s1.studentCity="Mumbai";

        s1.showFullDetails();

        Student s2 = new Student(35, "Shiv");
        s2.studentName = "Shiv";
        s2.studentId=133;
        s2.studentCity="Yadav";

        s2.showFullDetails();
    }
}