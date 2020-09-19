package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;

        for (int i =0; i < board.length; i++) {
                if (board[i][i] == 1) {
                    rsl = checkHorisont(board[i]) || checkVertical(board, i);
            }
        }

        return rsl;
    }

    private static boolean checkHorisont(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkVertical(int[][] array, int i) {
        for (int j = 0; j < array[i].length; j++) {
            if (array[j][i] != 1) {
                return false;
            }
        }
        return true;
    }
}
