package blockchain;

import java.util.ArrayList;

public class Blockchain {

    private Block genesis;
    private ArrayList<Block> blockchain;

    public Blockchain() {

    }

    public Blockchain(Block genesis, ArrayList<Block> blockchain) {
        this.genesis = genesis;
        this.blockchain = blockchain;
    }

    public void getEachHashCode() {
        for (Block block : blockchain) {
            System.out.println(block.getBlockHash());
        }
    }

    public void useDefault() {

        String[] genesisTransactions = {
                "gian sent kianna 1000000 bitcoins",
                "gi sent 10 bitcoins to ki"
        };

        genesis = new Block(
                0,
                genesisTransactions
        );

        String[] block2Transactions = {
                "ia sent ai 10 bitcoins",
                "ai sent 10 bitcoins to yakimix"
        };

        Block block2 = new Block(
                genesis.getBlockHash(),
                block2Transactions
        );

        String[] block3Transactions = {
                "aa sent bb 10000 bitcoins",
                "bb sent 1 bitcoin to cc"
        };

        Block block3 = new Block(
                block2.getBlockHash(),
                block3Transactions
        );

        System.out.println("block 1 hash: " + genesis.getBlockHash());
        System.out.println("block 2 hash: " + block2.getBlockHash());
        System.out.println("block 3 hash: " + block3.getBlockHash());
    }

    public void proofOfWork() {

    }

    public void proofOfStake() {

    }
}
