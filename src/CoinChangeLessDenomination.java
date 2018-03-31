
public class CoinChangeLessDenomination {

	public static void main(String[] args) {

		// int coins[] = { 9, 6, 5, 1 }, V = 11;

		int coins[] = { 25, 10, 4, 1 }, V = 30;

		System.out.println(findCoins(coins, V));
		

	}

	private static int findCoins(int[] n, int target) {

		if (target < 1) {
			return 0;
		}

		return getCoins(n, n.length, target);

	}

	private static int getCoins(int[] n, int length, int target) {

		if (target == 0) {
			return 0;
		}

		int res = Integer.MAX_VALUE;

		for (int i = 0; i < n.length; i++) {

			if (n[i] <= target) {

				int sub_res = getCoins(n, n.length, target - n[i]);

				if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res) {
					res = sub_res + 1;
				}

			}
		}
		return res;
	}
}
