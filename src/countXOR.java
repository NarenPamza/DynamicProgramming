/*
 * Find the Pair whose total is Even
 */
public class countXOR {

	public static void main(String[] args) {

		int n[] = { 2, 1, 5, -6, 9 };
		System.out.println(countXORValueEff(n));
		System.out.println(countXORValue(n));

	}

	private static int countXORValue(int[] n) {

		if (n == null) {
			return 0;
		}

		int count = 0;

		for (int i = 0; i < n.length; i++) {

			for (int j = i + 1; j < n.length; j++) {

				if ((n[i] ^ n[j]) % 2 == 0) {
					count++;
				}
			}
		}

		return count;
	}
	
	private static int countXORValueEff(int[] A) {
		
		if (A == null) {
			return -1;
		}
		
		int odd = 0;
		int even = 0;

		for (int i = 0; i < A.length; i++) {
			
			if(A[i] % 2 == 0){
				even++;
			}
			else {
				odd++;
			}
		}

		// For Odd
		return (even*(even-1) + odd* (odd-1))/2;
		
		// For Even
//		return odd*even;
	}

}
