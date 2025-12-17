class Rahul{
    String name;
    int age;
    public Rahul(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name is :- "+name+" and" +" Age:-"+age);
    
    }

}

public class student1 {
    public static void main(String[] args) {
        Rahul p1=new Rahul("rahul",20);
        p1.display();
    }
    
}