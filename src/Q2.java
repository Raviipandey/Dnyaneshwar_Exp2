class Chaining{
    int a;
    int b;
    public Chaining(){
        this(2);
    }
    public Chaining(int a) {
        this(a,3);
    }
    public Chaining(int a, int b) {
        this.a=a;
        this.b=b;
    }
}

public class Q2 {
    public static void main (String[] args) {

        Chaining c1 = new Chaining();
        Chaining c2 = new Chaining(5);
        Chaining c3 = new Chaining(8, 9);

        System.out.println(c1.a + " " + c1.b);
        System.out.println(c2.a + " " + c2.b);
        System.out.println(c3.a + " " + c3.b);
    }
}