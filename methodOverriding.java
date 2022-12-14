// Overriding the method of parent class in child class is called method overriding
class Parent{
    public void show1(){
        System.out.println("I am in parent class");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("I am in child class");
    }
}
class methodOverriding{
    public static void main(String[] args) {
        // Parent p = new Parent();
        // p.show();
        Child c = new Child();
        c.show();
        Parent pc = new Child(); // Most Important topic 
        pc.show();
        /*  'Parent pc' is taken care by COmpiler and 'new Child()' will be taken care by JVM
         * So we have to make sure that method should be there in parent Or else it will throw error, 
         * But while executing it will give output from method present in child, because it is taken care by JVM
         * If it is not there in child then it will execute parent method. It means in any case method should be there in parent
         * For eg: if you keep show1() in parent and show() in child it wont execute but reverse is possible
         */
    }
}