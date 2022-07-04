interface FirstInterface{
    public void myMethod(); //interface methodu
}
interface SecondInterface{
    public void myOtherMethod(); // interface methodu
}

class DemoClass implements FirstInterface,SecondInterface{
    public void myMethod(){
        System.out.println("Some text...");
    }
    public void myOtherMethod(){
        System.out.println("Some other Text....");
    }
}


class Main{
public static void main(String[] args) {
    DemoClass myObj= new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
}

}