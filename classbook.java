package ll;
public class classbook {
    static class Book{
        String title;
        String author;
        double price;

        Book(){
            System.out.println("hi");
            this.title="hhh";
            this.author="iii";
            this.price=12.45;

        }
        void display(){
        System.out.println(this.title +" "+this.author+" "+this.price);
    }
}
    public static void main(String[] args) {
        Book b1 = new Book();
        // b1.author ="x";
        // b1.title="y";
        // b1.price=10.0;
        // b1.display();
    
    }
}






