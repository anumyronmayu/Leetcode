package defaultPackage;

import java.util.HashMap;

public class Problem36 {

	public static boolean isValidSudoku(char[][] board) {

		for (int i = 0; i < 9; i++) {

			HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			for (int j = 0; j < 9; j++) {
				if (map.get(board[i][j]) == null) {
					map.put(board[i][j], 1);
				} else if (map.get(board[i][j]) != null && board[i][j] != '.') {
					return false;
				}
			}
		}

		for (int i = 0; i < 9; i++) {

			HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			for (int j = 0; j < 9; j++) {
				if (map.get(board[j][i]) == null) {
					map.put(board[j][i], 1);
				} else if (map.get(board[j][i]) != null && board[j][i] != '.') {
					return false;
				}
			}
		}

		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++){
				
				HashMap<Character, Integer> map = new HashMap<Character, Integer>();
				
				for(int k = 0; k < 3; k++){
					for(int l = 0; l < 3; l++){
						
						if (map.get(board[k + 3 * i][l + 3 * j]) == null) {
							map.put(board[k + 3 * i][l + 3 * j], 1);
						} else if (map.get(board[k + 3 * i][l + 3 * j]) != null && board[k + 3 * i][l + 3 * j] != '.') {
							return false;
						}
						
					}
				}
				
			}
		}

		return true;

	}

	public static void main(String[] args) {
		char[][] test = { { '1', '2', '3', '4', '5', '6', '7', '8', '9' },
				{ '4', '5', '6', '7', '8', '9', '1', '2', '3' },
				{ '7', '8', '9', '1', '2', '3', '4', '5', '6' },
				{ '1', '2', '3', '4', '5', '6', '7', '8', '9' },
				{ '4', '5', '6', '7', '8', '9', '1', '2', '3' },
				{ '7', '8', '9', '1', '2', '3', '4', '5', '6' },
				{ '1', '2', '3', '4', '5', '6', '7', '8', '9' },
				{ '4', '5', '6', '7', '8', '9', '1', '2', '3' },
				{ '7', '8', '9', '1', '2', '3', '4', '5', '6' } };

		System.out.println(isValidSudoku(test));

	}

}
