import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class containerWithMostWater {

	public static void main(String[] args) {

		int[] a = { 3, 1, 2, 4, 5 };

		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}

		List<Integer> keys = new ArrayList<>(map.keySet());
		int j = keys.size() - 1;
		int distance = 0;
		int totalArea = 0;
		int height = 0;
		for (int i = 0; i < j; i++) {
			Integer maxValue = map.get(keys.get(j));
			Integer maxKey = keys.get(j);

			Integer currentKey = keys.get(i);
			Integer currentIndexValue = map.get(keys.get(i));

			distance = Math.abs(maxValue - currentIndexValue);

			height = Math.min(maxKey, currentKey) * distance;

			if (height > totalArea) {
				totalArea = height;
			}
		}

		System.out.println(totalArea);
	}
}
