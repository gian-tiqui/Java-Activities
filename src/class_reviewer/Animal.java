package class_reviewer;

public class Animal {

    String name;
    int age;

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void doSomething() {
        System.out.println("ok no");
    }
}
