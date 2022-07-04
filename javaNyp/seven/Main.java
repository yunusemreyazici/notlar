public class Main{
    int modelYear;
    String modelName;
    public Main (int year,String name){
        modelName=name;
        modelYear=year;
    }
    public static void main(String[] args) {
        Main myCar=new Main(1969, "Mustang");
        System.out.println(myCar.modelYear+" "+myCar.modelName);
    }
}