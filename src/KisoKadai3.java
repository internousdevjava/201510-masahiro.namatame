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

		// ������
		System.out.println("�g�b�v���j���[");
		System.out.println();
		System.out.println("�t�@�C����ǂݍ���Ŏn�߂�ꍇ�́u1�v");
		System.out.println("�V�����쐬����ꍇ�́u2�v");
		System.out.println("�v���O�������I������ꍇ�́u3�v");
		System.out.println();

		// �w����3�ɂȂ�܂ł͏I�����Ȃ��B
		while (shiji != 3) {
			System.out.println("�Y���̐�������͂��ăG���^�[�������Ă��������B�F");

			// �����t�@�C����ҏW����ꍇ�́u1�v�̂��߃t�H���_�̎w�������B
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();

				shiji = Integer.parseInt(buf);
			} catch (Exception e) {
				shiji = 0;
			}

			// �ςȓ��͂̂Ƃ��̃G���[��
			if (shiji == 0) {
				System.out.println("1,2��������3����͂��Ă��������B");
				System.out.print("������x");
				continue;

				// �V�K�t�@�C�����쐬����B�t�H���_���Ȃ��ꍇ�̓t�H���_���쐬����B
			} else if (shiji == 1) {
				System.out.println("�ǂݍ��ރt�@�C���̕ۑ�����w�肵�Ă��������B");

				// �f�B���N�g���̎w�������B
				InputStreamReader isr1 = new InputStreamReader(System.in);
				BufferedReader br1 = new BufferedReader(isr1);
				try {
					dir_name = br1.readLine();

				} catch (Exception e1) {
					sakusei = 0;

				}
				System.out.println("�ǂݍ��ރt�@�C�������w�肵�Ă��������B");
				InputStreamReader isr11 = new InputStreamReader(System.in);
				BufferedReader br11 = new BufferedReader(isr11);
				try {
					fil_name = br11.readLine();

				} catch (Exception e11) {
					sakusei = 0;

				}

				// 1,2,3�ȊO�̎��̕��B System.out.println("1,2��������3����͂��Ă��������B");
			} else if (shiji == 2) {
				System.out.println("�t�@�C���쐬��̃t�H���_���w�肵�Ă��������B");

				InputStreamReader isr2 = new InputStreamReader(System.in);
				BufferedReader br2 = new BufferedReader(isr2);
				try {
					String buf2 = br2.readLine();

					sakusei = Integer.parseInt(buf2);
				} catch (Exception e2) {
					sakusei = 0;

				}

				
				
				
			}
			// �t�@�C�����o�͂���B
			op_fil = dir_name + "\\" + fil_name;

		}
	}
}