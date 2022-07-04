// Abstract class
abstract class Main{
    public String fname="John";
    public int age=24;
    public abstract void study();
}
//Subclass (inherit from main)
class Student extends Main{
    public int graduationYear=2018;
    public void study(){
        System.out.println("Studying all day long");
    }
}
