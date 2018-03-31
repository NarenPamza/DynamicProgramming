import java.util.Arrays;

public class MinimumDistance {

	public static void main(String[] args) {

		int a[] = { 8, 24, 3, 20, 1, 17 };

		System.out.println(solution(a));

	}

	public static int solution(int[] A) {

		if (A == null) {
			return -1;
		}
		int result = Integer.MAX_VALUE;

		Arrays.sort(A);

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i + 1] - A[i] < result) {
				result = A[i + 1] - A[i];
			}
		}

		return result;
	}

}
