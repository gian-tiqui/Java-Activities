package lambda;

import interfaces.Runner;

public class Lambda {

    public Lambda () {
        Runner runner = () -> System.out.println("meow");

        runnerOfRunner(runner);
    }

    public void runnerOfRunner(Runner runner) {
        runner.run();
    }
}
