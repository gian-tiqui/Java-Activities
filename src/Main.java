import class_reviewer.WhatIsThis;

public class Main implements WhatIsThis {

    public static void main(String[] args) {

        Main main = new Main();

        main.helloWorld("print");
    }

    @Override
    public void helloWorld(String word) {
        System.out.println(word);
    }
}