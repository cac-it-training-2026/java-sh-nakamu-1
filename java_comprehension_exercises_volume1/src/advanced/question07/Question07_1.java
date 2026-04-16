package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] itemNames = new String[5];

		for (int i = 0; i < itemNames.length; i++) {
			System.out.println("商品" + (i + 1) + "を入力してください＞");
			itemNames[i] = reader.readLine();

		}

		int[] price = new int[itemNames.length];
		System.out.println("各商品の単価を順に入力してください");
		for (int i = 0; i < price.length; i++) {
			System.out.println(itemNames[i] + "の単価＞");
			String priceString = reader.readLine();
			price[i] = Integer.parseInt(priceString);
		}

		System.out.println("登録商品一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：" + price[i] + "円");
		}

	}

}
