package ll;

public class classbook3 {
        static class student{
     String name; long usn ;double cgp; int age;
     student (String name,long usn,double cgp,int age){
        this.name=name ;
        this.usn=usn;
        this.cgp=cgp;
        this.age=age;
     }
      void display(){
        System.out.println(this.name +" "+this.usn+" "+this.cgp+" "+this.age);
    }
 }
 public static void main(String[] args) {
    student b1 = new student();
      b1.name="M"; 
      b1.usn=239260807;
      b1.cgp=9.9;
      b1.age=19;
      b1.display();
  }
}

