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
		// �^�C�g��
		System.out.println("�S�S�̕\");

		// x�̓��͎w����
		int x = 0;

		// 1��菬�����A100���傫����������͂����Ƃ��͓��͎w�����ɖ߂�B
		while (x < 1 || x > 100) {

			System.out.println("X���̐�������͂��Ă�������: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			// �����ȊO�̂��̂𖳌�������B
			try {
				String buf = br.readLine();
				x = Integer.parseInt(buf);
			} catch (Exception e) {
				x = 0;

			}
			// 1�`100�ȊO�̐���������ƃG���[����\��������B
			if (x < 1 || x > 100) {
				System.out.println("1~100�̐�������͂��Ă�������! ");

			}
		}

		int y = 0;
		// 1��菬�����A100���傫����������͂����Ƃ��͓��͎w�����ɖ߂�B
		while (y < 1 || y > 100) {

			System.out.println("Y���̐�������͂��Ă�������: ");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			// �����ȊO�̂��̂𖳌�������B
			try {
				String buf = br.readLine();
				y = Integer.parseInt(buf);
			} catch (Exception e) {
				y = 0;

			}

			// 1�`100�ȊO�̐���������ƃG���[����\��������
			if (y < 1 || y > 100) {
				System.out.println("1~100�̐�������͂��Ă�������! ");
			} else {

				System.out.println("�v�Z���ʂ��ȉ��ɕ\�����܂��B");
				System.out.println();
			}
		}

		// ���̌��ʂ��v�Z�B
		for (int i = y; i > 0; i--) {
			for (int j = 1; j <= x; j++) {

				// �����𐮂���
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

				// ���̌v�Z���ʂ��E�����ɏo�͂��A�B
				System.out.print(i * j);

			}
			System.out.println();
		}
	}
}
