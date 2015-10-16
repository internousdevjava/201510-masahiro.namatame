
/**
 * 
 */

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author internous
 *
 */
public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		// タイトル
		System.out.println("『数当てゲーム』");
		System.out.println();
		// ルール説明文の表示
		System.out.println("【ルール】");
		System.out.println("コンピューターがランダムで保持した数字を当てるゲームです。");
		System.out.println("あなたの入力した値に対して答えより大きいか小さいかのヒントを返します。");
		System.out.println("そのヒントを元にコンピューターの保持している数字を当ててください。");
		System.out.println();
		System.out.println("それでは張り切ってきましょう！");

		int ans = random.nextInt(100);
		int userAns = 0;

		while (ans != userAns) {

			System.out.print("1～100の数字を入力してください。:");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();

				userAns = Integer.parseInt(buf);
			} catch (Exception e) {
				userAns = 0;

			}
			if (ans < userAns) {
				System.out.println("その数字より小さいです。");
			} else if(ans > userAns){
				System.out.println("その数字より大きいです。");
			}
			
		}
		System.out.println("正解！");
		
	}
}
