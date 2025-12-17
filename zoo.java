class animal {
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class lion extends animal {
    String name;
    int age;

    public lion(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void roar(){
        System.out.println("Lion is roaring");
    }

}
class tiger extends animal {
    String name;
    int age;

    public tiger(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void growl(){
        System.out.println("Tiger is growling");
    }

}
class elephant extends animal {
    String name;
    int age;

    public elephant(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void trumpet(){
        System.out.println("Elephant is trumpeting");
    }

}
class fish extends animal {
    String name;
    int age;

    public fish(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void blub(){
        System.out.println("Fish is blubbing");
    }

}
public class zoo {
    public static void main(String[] args) {
        lion l1 = new lion("Simba",20);
        l1.sleep();
        l1.roar();

        tiger t1 = new tiger("Sanju",15);
        t1.sleep();
        t1.growl();

        elephant e1 = new elephant("Danush",10);
        e1.sleep();
        e1.trumpet();

        fish f1 = new fish("Nehal",4);
        f1.sleep();
        f1.blub();
    

                
    }
}

