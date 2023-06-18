package class_reviewer;

public class Dog extends Animal{

    boolean isAlive = true;

    public Dog(String name, int age, boolean isAlive) {
        super(name, age);
        this.isAlive = isAlive;
    }

    @Override
    public void doSomething() {
        System.out.println("arf");
    }
}
