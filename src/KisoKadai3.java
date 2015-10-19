import java.io.*;
/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int shiji = 0;
		int sakusei = 0;

		String op_fil = null;
		String dir_name = null;
		String fil_name = null;

		// 説明文
		System.out.println("トップメニュー");
		System.out.println();
		System.out.println("ファイルを読み込んで始める場合は「1」");
		System.out.println("新しく作成する場合は「2」");
		System.out.println("プログラムを終了する場合は「3」");
		System.out.println();

		// 指示が3になるまでは終了しない。
		while (shiji != 3) {
			System.out.println("該当の数字を入力してエンターを押してください。：");

			// 既存ファイルを編集する場合は「1」のためフォルダの指定をする。
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();

				shiji = Integer.parseInt(buf);
			} catch (Exception e) {
				shiji = 0;
			}

			// 変な入力のときのエラー文
			if (shiji == 0) {
				System.out.println("1,2もしくは3を入力してください。");
				System.out.print("もう一度");
				continue;

				// 新規ファイルを作成する。フォルダがない場合はフォルダも作成する。
			} else if (shiji == 1) {
				System.out.println("読み込むファイルの保存先を指定してください。");

				// ディレクトリの指定をする。
				InputStreamReader isr1 = new InputStreamReader(System.in);
				BufferedReader br1 = new BufferedReader(isr1);
				try {
					dir_name = br1.readLine();

				} catch (Exception e1) {
					sakusei = 0;

				}
				System.out.println("読み込むファイル名を指定してください。");
				InputStreamReader isr11 = new InputStreamReader(System.in);
				BufferedReader br11 = new BufferedReader(isr11);
				try {
					fil_name = br11.readLine();

				} catch (Exception e11) {
					sakusei = 0;

				}

				// 1,2,3以外の時の文。 System.out.println("1,2もしくは3を入力してください。");
			} else if (shiji == 2) {
				System.out.println("ファイル作成先のフォルダを指定してください。");

				InputStreamReader isr2 = new InputStreamReader(System.in);
				BufferedReader br2 = new BufferedReader(isr2);
				try {
					String buf2 = br2.readLine();

					sakusei = Integer.parseInt(buf2);
				} catch (Exception e2) {
					sakusei = 0;

				}

				
				
				
			}
			// ファイルを出力する。
			op_fil = dir_name + "\\" + fil_name;

		}
	}
}