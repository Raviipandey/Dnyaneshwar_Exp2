class Book{
    String name;
    public void display(){
        System.out.println("Name:"+name);
    }
}

class Magazine extends Book{
    String publisher;
    public void display(){
        super.display();
        System.out.println("publisher:  "+publisher);
    }

}
public class Q4 {
    public static void main (String[] args)
    {

        Magazine b1=new Magazine();
        b1.name="Nancy";

        b1.publisher="nancy drew";
        b1.display();


    }
}