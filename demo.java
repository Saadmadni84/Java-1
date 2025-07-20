
class Animal{
    void breathe(){
        System.out.println("72 times");
    }
    void eat(){
        System.out.println("eat anyything");    
    }

    
    
}
class Deer extends Animal{
    public int d=50;
    void eat(){
        System.out.println("eat grass");

    }
    void drink(){
        System.out.println("water");
    }
    
}
public class demo{
    public static void main(String[] args){
        Animal a=new Deer();
        a.breathe();
        a.eat();
        
        Deer d=new Deer();
        d.breathe();
        d.eat();
        d.drink();
   }
}