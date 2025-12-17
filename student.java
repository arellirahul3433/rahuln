 class About{
    String name;
    int age;

    public void display()
    {
        System.out.println("Name of the Student : " + name + " and Age is : " + age);      
    }
}

        public class  student {
             public static void main(String[] args) {
                 About a1 =  new About();
                 a1.name = "Nithin";
                 a1.age = 21;    
                 a1.display();
                 
                 About a2 = new About();
                 a2.name = "Sai";       
                 a2.age = 22;
                 a2.display();

                 About a3 = new About();
                 a3.name = "rahul";       
                 a3.age = 20;
                 a3.display();

    }   
    
}