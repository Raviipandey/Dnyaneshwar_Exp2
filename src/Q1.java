class MethodOverloading{

    public MethodOverloading(){
        System.out.println(" no parameter constructor");
    }

    public MethodOverloading(String an){
        System.out.println(" parameter constructor-  "+an);
    }
    public void print(){
        System.out.println(" no parameter method");

    }
    public void print(String an){
        System.out.println("parameter method-  "+an);
    }

}


public class Q1 {
    public static void main(String[] args) {

        MethodOverloading o1 = new MethodOverloading();
        MethodOverloading o2 = new MethodOverloading("Anushka");

        o1.print();
        o1.print("Raj");


    }
}