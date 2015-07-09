package defaultPackage;

public class Problem122 {

	public int maxProfit(int[] prices) {

		boolean hold = false;

		int buy = 0;
		int sale = 0;
		int sum = 0;

		for (int i = 0; i < prices.length - 1; i++) {

			if (prices[i + 1] > prices[i] && hold == false) {
				hold = true;
				buy = prices[i];
			} else if (prices[i + 1] < prices[i] && hold == true) {
				hold = false;
				sale = prices[i];
				sum = sum + (sale - buy);
			} else {

			}

		}

		if (hold == true) {
			sum = sum + (prices[prices.length - 1] - buy);
		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
