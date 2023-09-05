import blockchain.Block;
import blockchain.Blockchain;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Block genesis = new Block(
                0,
                new String[] {"a sent b 10 bitcoins", "b sent c 5 bitcoins"}
        );

        Blockchain blockchain = new Blockchain(genesis);

        blockchain.addBlock(
                new Block(
                        genesis.getBlockHash(),
                        new String[] {"2nd transaction"}
                )
        );

        blockchain.getEachHashCode();
    }
}