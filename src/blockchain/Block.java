package blockchain;

import java.util.*;

/*

        Hash = Digital Signature

        Each block will have:

            List of transactions
            Previous Hash
            A Hash

*/

public class Block {

    private int prevHash;
    private String[] transactions;
    private int blockHash;

    public Block(int prevHash, String[] transactions) {
        this.prevHash = prevHash;
        this.transactions = transactions;

        Object[] contens = {Arrays.hashCode(transactions), prevHash};
        this.blockHash = Arrays.hashCode(contens);
    }

    public int getPrevHash() {
        return prevHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
