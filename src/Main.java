import blockchain.Block;
import blockchain.Blockchain;

import java.util.*;

public class Main {

    public static void main(String[] args) {

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