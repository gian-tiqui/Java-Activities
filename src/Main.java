import blockchain.Block;
import blockchain.Blockchain;
import console.console;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 4, 3, 2, 1, 0);

        nums.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .map(n -> n*2)
                .forEach(System.out::println);

        int res = nums.parallelStream()
                .filter(n -> n % 2 != 0)
                .map(n -> n*2)
                .reduce(0, Integer::sum);

        console.log("res = ".concat(String.valueOf(res)));
    }

    public static void blockchainTest() {

        Block genesis = new Block(
                0,
                new String[] {"1st transaction", "2nd transaction"}
        );

        Blockchain blockchain = new Blockchain(genesis);

        blockchain.addBlock(
                new Block(
                        genesis.getBlockHash(),
                        new String[] {"1nd transaction"}
                )
        );

        blockchain.getEachHashCode();
    }
}