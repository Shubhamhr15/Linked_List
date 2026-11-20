package ll;
public class classbook2 {
     static class bank{
     String name; int account_no ;double balance;

      void display(){
        System.out.println(this.name +" "+this.account_no+" "+this.balance);
    }
 }
 public static void main(String[] args) {
    bank b1 = new bank();
      b1.name="M"; 
      b1.account_no=123;
      b1.balance=1000;
      b1.display();
  }
}
