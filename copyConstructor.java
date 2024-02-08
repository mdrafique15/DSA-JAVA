public class copyConstructor {
    public static void main(String[] args) {
    //object creation
    Student s1 = new Student();
    s1.name = "Joy";
    s1.roll = 123;
    s1.password = "abcd";
    s1.marks [0]=100;
    s1.marks [1]=90;
    s1.marks [2]=89;

   //incase the s1 student forget the password
   //new object s2 is created  
   Student s2 = new Student(s1);
   s2.password = "xyz";
   s2.marks[2]=99;
   
   for(int i=0;i<3;i++){
    System.out.println(s2.marks[i]);
   }
   
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
  //copy constructor
  //s1==s2
  //properties of s1 copied to s2
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    Student(){
        marks = new int[3];
        System.out.println("Consructor is called!");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
Student(int roll){
    marks = new int[3];
    this.roll = roll;
}
}