package case02;

import java.util.ArrayList;
import java.util.List;

public class GuestbookMain {

	private static List<Guestbook> guestbooks = new ArrayList<>();

	public static void main(String[] args) {
		// 留言1
		Guestbook g1 = new Guestbook("哈囉大家好");
		guestbooks.add(g1); // 存入留言
		System.out.println(guestbooks);

		// 留言2
		Guestbook g2 = new Guestbook("好像快要下雨了");
		guestbooks.add(g2); // 存入留言
		System.out.println(guestbooks);

	}

}
