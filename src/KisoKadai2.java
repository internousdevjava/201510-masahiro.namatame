
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
		// �^�C�g��
		System.out.println("�w�����ăQ�[���x");
		System.out.println();
		// ���[���������̕\��
		System.out.println("�y���[���z");
		System.out.println("�R���s���[�^�[�������_���ŕێ����������𓖂Ă�Q�[���ł��B");
		System.out.println("���Ȃ��̓��͂����l�ɑ΂��ē������傫�������������̃q���g��Ԃ��܂��B");
		System.out.println("���̃q���g�����ɃR���s���[�^�[�̕ێ����Ă��鐔���𓖂ĂĂ��������B");
		System.out.println();
		System.out.println("����ł͒���؂��Ă��܂��傤�I");

		int ans = random.nextInt(100);
		int userAns = 0;

		while (ans != userAns) {

			System.out.print("1�`100�̐�������͂��Ă��������B:");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();

				userAns = Integer.parseInt(buf);
			} catch (Exception e) {
				userAns = 0;

			}
			if (ans < userAns) {
				System.out.println("���̐�����菬�����ł��B");
			} else if(ans > userAns){
				System.out.println("���̐������傫���ł��B");
			}
			
		}
		System.out.println("�����I");
		
	}
}
