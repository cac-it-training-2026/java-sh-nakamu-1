package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		int[] stocks = new int[itemNames.length];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "の在庫数＞");
			String stockString = reader.readLine();
			stocks[i] = Integer.parseInt(stockString);
		}

		for (int i = 0; i < itemNames.length; i++) {
			int amount = 0;
			boolean isValid = false;

			while (isValid == false) {
				System.out.println(itemNames[i] + "の購入数＞");
				String amountString = reader.readLine();
				amount = Integer.parseInt(amountString);

				if (amount > stocks[i]) {
					System.out.println("在庫を超えています。もう一度入力してください。");
					continue;
				} else {
					amounts[i] = amount;
					isValid = true;
				}
			}
		}

		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：" + "購入" + amounts[i] + "個");
			stocks[i] = stocks[i] - amounts[i];
			System.out.println("在庫" + stocks[i] + "個");
		}

	}
}
