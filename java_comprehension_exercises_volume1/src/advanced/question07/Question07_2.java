package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };

		int[] amounts = new int[itemNames.length];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "の購入数＞");
			String buyString = reader.readLine();
			amounts[i] = Integer.parseInt(buyString);
		}

		int totalPrice = 0;
		int[] each_price = new int[itemNames.length];

		for (int i = 0; i < itemNames.length; i++) {
			each_price[i] = amounts[i] * prices[i];
			System.out.println(itemNames[i] + "：" + each_price[i] + "円");
			totalPrice += each_price[i];
		}

		System.out.println("合計金額：" + totalPrice + "円");
	}
}
