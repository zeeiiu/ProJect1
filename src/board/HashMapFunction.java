package board;

import java.util.HashMap;

public class HashMapFunction extends Board {

	public HashMapFunction() {

	}

	protected void run() {
		for (HashMap.Entry<Integer, Article> index : articleMap.entrySet()) {

			System.out.println(index.getKey() + "¹ø" + "  " + index.getValue().title + "  " + index.getValue().name
					+ "  " + index.getValue().date);
		}

	}
}
