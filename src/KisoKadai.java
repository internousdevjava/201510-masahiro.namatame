import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// タイトル
		System.out.println("百百の表");

		// xの入力指示文
		int x = 0;

		// 1より小さい、100より大きい数字を入力したときは入力指示文に戻る。
		while (x < 1 || x > 100) {

			System.out.println("X軸の数字を入力してください: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			// 数字以外のものを無効化する。
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				x = 0;

			}
			// 1～100以外の数字を入れるとエラー文を表示させる。
			if (x < 1 || x > 100) {
				System.out.println("1~100の数字を入力してください! ");

			}
		}

		int y = 0;
		// 1より小さい、100より大きい数字を入力したときは入力指示文に戻る。
		while (y < 1 || y > 100) {

			System.out.println("Y軸の数字を入力してください: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			// 数字以外のものを無効化する。
			try {
				String buf = br.readLine();
				y = Integer.parseInt(buf);
			} catch (Exception e) {
				y = 0;

			}

			// 1～100以外の数字を入れるとエラー文を表示させる
			if (y < 1 || y > 100) {
				System.out.println("1~100の数字を入力してください! ");
			} else {

				System.out.println("計算結果を以下に表示します。");
				System.out.println();
			}
		}

		// 九九の結果を計算。
		for (int i = y; i > 0; i--) {
			for (int j = 1; j <= x; j++) {

				// 書式を整える
				if (i * j <= 9) {
					System.out.print("      ");
				} else if (i * j <= 99) {
					System.out.print("     ");
				} else if (i * j <= 999) {
					System.out.print("    ");
				} else if (i * j <= 9999) {
					System.out.print("   ");
				} else {
					System.out.print("  ");
				}

				// 一つ一つの計算結果を右方向に出力し、。
				System.out.print(i * j);

			}
			System.out.println();
		}
	}
}
