class package testFile;

import java.io.*;

public class IdNumInspector {
	private String idNum;// �ֹι�ȣ ���
	private BufferedReader br;
	private int[] total;// ���� �Է� Ƚ��, ���� �Է� Ƚ��, ������ �Է�Ƚ��
	private boolean isRun;
	private int[] tempIdNum;// �ֹι�ȣ �԰ݿ� ��Ȯ�� ������ ���� �迭
	private final int[] CHECK_ARR = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

	public IdNumInspector() {
		br = new BufferedReader(new InputStreamReader(System.in));
		total = new int[3];// ���â�� ������� �޼��忡 ��� ������ ��� �迭
		isRun = false;
		idNum = "";
		tempIdNum = new int[13];
	}

	public void start() throws IOException {
		printText();
		while (!isRun) {
			System.out.print(">> ������ �Է�: ");
			idNum = br.readLine();
			if (idNum.equals("exit")) {// while�� Ż������
				exitText();
				isRun = true;
			}
			if (idNum.length() == 14) {
				inspectNum(idNum);
			} else {
				System.err.println("-�� �����ϰ� ��� 0 ~ 9 �����̾�� �մϴ�.");
				total[2] += 1;
			}
		}

	}

	public void inspectNum(String idNum) {

		boolean idChAt6 = idNum.charAt(6) == '-' ? true : false;
		String sub1 = idNum.substring(0, 6);
		String sub2 = idNum.substring(7);

		if (idChAt6) {// �ѱ��ڼ��� 14�����̸�, ������ �ڸ��� �������� �ֳ�
			try {
				toIntChar(sub1, sub2);
				// �������߳ĸ� �����ؼ� �迭���� ����
			} catch (NumberFormatException nfe) {
				System.err.println("-�� �����ϰ� ��� 0 ~ 9 �����̾�� �մϴ�.");
				total[2] += 1;
			}
			int idEachNumTotal = 0;
			for (int i = 0; i < 12; i++) {
				idEachNumTotal += (CHECK_ARR[i] * tempIdNum[i]);
			}
			boolean finalBool = (11 - (idEachNumTotal % 11) == tempIdNum[12]) ? true : false;
			if (finalBool) {
				total[0] += 1;
				System.out.println("[���� ����] �������� �ֹι�ȣ�̸� ������ �����ϴ�!");
			} else {
				total[1] += 1;
				System.err.println("[���� ����] �ֹ� ��ȣ ��ġ���� ������ �ֽ��ϴ�.");
			}

		} else {
			System.err.println("�ֹι�ȣ�� oooooo-ooooooo ������ ���� 14�ڸ� �Դϴ�.");
			total[2] += 1;
		}
	}

	public void toIntChar(String sub1, String sub2) {

		for (int i = 0; i < sub1.length(); i++) {
			// tempIdNum[i] = Integer.parseInt(""+sub1.charAt(i));
			tempIdNum[i] = Integer.parseInt(Character.toString(sub1.charAt(i)));

		}
		for (int i = 0; i < sub2.length(); i++) {
			// tempIdNum[i] = Integer.parseInt(""+sub1.charAt(i));
			tempIdNum[i + 6] = Integer.parseInt(Character.toString(sub2.charAt(i)));
		}
	}

	public void printText() {
		System.out.println("==============================\r\n" + "�̷�ũ���� �ֹι�ȣ ���� �� ���� ���α׷�\r\n" + "-���ϼ�\r\n"
				+ "==============================");
		System.out.println("* �ֹι�ȣ �Է� (oooooo-ooooooo ������ ���� 14�ڸ�" + ", exit �Է½� ����)");
	}

	/**
	 * ���â ��� ���� �ֹ� ��ȣ �迭�� 0����, ���� �ֹι�ȣ 1����, ������ �Է� 2����, �� �Է� �Ǽ� �迭�� 3����
	 */
	public void exitText() {
		int totalSum = 0;
		for (int i : total) {
			totalSum += i;
		}
		/*
		 * float fl1 = total[0]/(float)totalSum; float fl2 = total[1]/(float)totalSum;
		 * float fl3 = total[2]/(float)totalSum;
		 */
		System.out.println("-�� �Է� �Ǽ�: " + totalSum + "��");
		System.out.println("-���� �ֹι�ȣ: " + total[0] + "��" + textPercent(total[0], totalSum));
		System.out.println("-���� �ֹι�ȣ: " + total[1] + "��" + textPercent(total[1], totalSum));
		System.out.println("-������ �Է�: " + total[2] + "��" + textPercent(total[2], totalSum));
		System.out.println();

	}

	public String textPercent(int total, int totalSum) {
		float percent = (total / (float) totalSum)*100f;
		String strPerc = String.format("%.2f", percent);
		return "(" + strPerc + "%)";
	}
	
	public static void main(String[] args) {
		IdNumInspector idIns = new IdNumInspector();
		try {
			idIns.start();
		} catch (Exception e) {
				
		}
	}

}
 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
