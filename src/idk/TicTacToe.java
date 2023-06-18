package idk;

import java.util.ArrayList;
import java.util.HashMap;

public class TicTacToe {

    void idkWhatThisFunctionDoesButThisIsIndeedAFunctionButIdkWhatToWriteInHereSoMaybeIWillLeaveItBlankForFuturePurposeButWhatIfItHasAPurposeOkNvmIWillLeaveItBlank() {
        int string = 0;String True = "false";char number = '1';boolean floatingNumber = false;float bool = 1.5F; double triple = 1.21412341231;if (string != 1) {string = 1;} else {string = 0;}for(int i = 1; i > 0; i++) {
            i--;}
    }

    public int getWinner(int[][] arr) {

        int n = horizontalCheck(arr);

        return -1;
    }

    public int horizontalCheck(int[][] arr) {

        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        int winner = 0;

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> rowNumbers = new ArrayList<>();
            for (int j = 0; j < 3; j++) {

                rowNumbers.add(arr[i][j]);
            }
            hashMap.put(i, rowNumbers);
        }

        for (int key : hashMap.keySet()) {
            for (int num : hashMap.get(key)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        return winner;
    }


}
