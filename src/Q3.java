

class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void display(){
        System.out.println(this.name+" "+this.subject);
    }
}
class Professor extends Teacher{
    String a;

    Professor(String a,String name,String subject){
        super(name, subject);
        this.a=a;

    }

}
class AssociateProfessor extends Teacher{
    String b;

    AssociateProfessor(String b,String name,String subject){
        super(name, subject);
        this.b=b;
    }
}
class AssistantProfessor extends Teacher{
    String c;

    AssistantProfessor(String c,String name,String subject){
        super(name, subject);
        this.c=c;
    }
}

public class Q3 {
    public static void main (String[] args)
    {
        Teacher t1=new AssociateProfessor("123","Anushka","Maths");
        t1.display();
        Teacher t2=new Professor("234","Raj","Chem");
        t2.display();
        Teacher t3=new AssistantProfessor("345","Ram","Maths");
        t3.display();
    }
}
