import blockchain.Block;
import blockchain.Blockchain;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Block genesis = new Block(
                0,
                new String[] {"a sent b 10 bitcoins", "b sent c 5 bitcoins"}
        );

        ArrayList<Block> bChain = new ArrayList<>();

        bChain.add(genesis);

        Blockchain blockchain = new Blockchain(genesis, bChain);

        blockchain.getEachHashCode();
    }
}