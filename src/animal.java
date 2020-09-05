public class animal {
    String name;
    int age;
    animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void Message(){
        System.out.println("This is animal");
    }
}
class App{
    public static void main(String[] args) {
     animal dog = new animal("inna", 5 );
     animal cat = new animal("Koshka", 2);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(cat.name);
        System.out.println(cat.age);
    }
}
