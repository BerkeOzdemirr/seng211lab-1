class Book{
    String title;
    String author;
    double price;
    public Book(){
        title = " ";
        author = " ";
        price = 0;
    }
    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void showDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Main{
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("doğu ekspresindeki cinayet" , "agatha christie" , 150.0);
        Book b3 = new Book("Aşk-ı Memnu","Halit Ziya Uşaklıgil",100.0);
        b1.showDetails();
        b2.showDetails();
    }
}