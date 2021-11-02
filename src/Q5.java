class Student{
    String name;
    String age;
    String program;

    public Student(String name, String age, String program) {
        this.name = name;
        this.age = age;
        this.program = program;

    }

    public  void display() {
        System.out.println("Student{" + "name='" + name + '\'' + ", age='" + age + '\'' + ", program='" + program + '\'' + '}');
    }
}
class Graduate extends Student{
    String percentage;
    String stream;

    public Graduate(String name, String age, String program, String percentage, String stream) {
        super(name, age, program);
        this.percentage = percentage;
        this.stream = stream;
    }

    public  void display() {
        System.out.println( "Graduate{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", program='" + program + '\'' +
                ", percentage='" + percentage + '\'' +
                ", stream='" + stream + '\'' +
                '}');
    }
}
class Research extends Student{
    String specialization ;
    String experience;

    public Research(String name, String age, String program, String specialization, String experience) {
        super(name, age, program);
        this.specialization = specialization;
        this.experience = experience;
    }

    public  void display() {
        System.out.println("name='" + name + '\'' + ", age='" + age + '\'' + ", program='" + program + '\'' + ", specialization='" + specialization + '\'' + ", experience='" + experience + '\'');
    }
}

public class Q5 {
    public static void main(String[] args) {

        Student s1=new Graduate("Anushka","19","Java","95%","IT");
        s1.display();
        Student s2=new Research("Anushka","19","Java","Java","2 year");
        s2.display();
    }
}