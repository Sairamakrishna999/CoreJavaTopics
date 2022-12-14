// MethodOverloading: Overloading the methods with same name 
//This can be done in 2 ways
// 1st way by passing more arguments
// 2nd way passing arguments of different data type
// And we can overload method just by changing return type eg: int add(); double add(); -> bcoz it will lead to ambiguity
class MethodOverloading{
    // 1st way by passing more arguments
    public  void add(int a){
        System.out.println("add method with 1 argument");
    }
    public  void add(int a,int b){
        System.out.println("add method with 2 arguments");
    }
    // 2nd way passing arguments of different data type
    public  void show(double d){
        System.out.println("show method with double data type");
    }
    public  void show(String s){
        System.out.println("show method with String data tyep");
    }
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add(10);
        mo.add(10,20);
        mo.show(10.2);
        mo.show("sai");
    }
}
