package case05;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;

//Partitioning是一切為二
//這就是一個「List 裡面存放 Integer 泛型的例子」
//表示 scores 是一個清單，裡面只能放 Integer 型別的資料，也就是整數。
public class Partitioning {

	public static void main(String[] args) {
		List<Integer> scores = List.of(100, 50, 40, 90, 80);
		/*
		 * "及格": [100, 90, 80] "不及格": [50, 40]
		 */
		// 使用Java Stream API 的 partitioningBy() 收集器來「分組」
		System.out.println(scores.stream().collect(partitioningBy(score -> score >= 60)));
	}

}
