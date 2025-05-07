package case05;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;

//Partitioning是一切為二
public class Partitioning {

	public static void main(String[] args) {
		List<Integer> scores = List.of(100, 50, 40, 90, 80);
		/*
		 * "及格": [100, 90, 80] "不及格": [50, 40]
		 */
		System.out.println(scores.stream().collect(partitioningBy(score -> score >= 60)));

	}

}
