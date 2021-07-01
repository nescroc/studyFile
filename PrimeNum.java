package testFile;

import java.util.*;

public class PrimeNum {
	private Random randNum;
	private HashSet<Integer> randSet;
	private int maxMin[];
	Iterator<Integer> iterKey;
	ArrayList<Integer> primeAr;

	public PrimeNum() {
		randNum = new Random();
		randSet = new HashSet<Integer>();
		maxMin = new int[2];
		primeAr = new ArrayList<Integer>();

	}

	// 0~���� 1000���� ������ ���� 100�� �ߺ��ȵǰ� HashSet�� ���Ͽ� ����
	public HashSet<Integer> randMaker() {
		// Random randNum = new Random();
		// HashSet<Integer> randSet = new HashSet<Integer>();
		boolean isRun = true;
		while (isRun) {
			randSet.add(randNum.nextInt(1001));
			if (randSet.size() == 100)
				isRun = false;
		}
		return randSet;
	}

	/**
	 * �ִ� �ּҰ� ��ȯ�迭 �޼���
	 * 
	 */
	public int[] rankPrimeNum(ArrayList<Integer> primeAr) {

		for (int i = 0; i < primeAr.size(); i++) {// �ִ밪, �ּҰ� ���ϴ� for��

			for (int j = 0; j < primeAr.size(); j++) {

				if ((primeAr.get(i) - primeAr.get(j) < 0))
					break;
				if (j == primeAr.size() - 1)
					maxMin[0] = primeAr.get(i);
			}

			for (int j = 0; j < primeAr.size(); j++) {// �ּҰ�
				if ((primeAr.get(i) - primeAr.get(j) > 0))
					break;
				if (j == primeAr.size() - 1)
					maxMin[1] = primeAr.get(i);
			}
		} // �ִ밪, �ּҰ� ���ϴ� for�� ����
		return maxMin;
	}

	/**
	 * ����Ҷ� ��� �κ�
	 */
	public void printText() {
		System.out.println("=======================");
		System.out.println("�̷�ũ���� �Ҽ� �Ǵ� ���α׷�");
		System.out.println("\t\t\t-���ϼ�");
		System.out.println("=======================");

	}

	/**
	 * printText�� �����ε��� ������� ������ִ� �޼���
	 */
	public void printText(int arLength, int[] maxMin) {
		System.out.println("------------------");
		System.out.println("�Ҽ����� : " + arLength);
		System.out.println("�ִ� �Ҽ� : " + maxMin[0] + "\n�ּ� �Ҽ� : " + maxMin[1]);
		System.out.println("------------------");
	}

	public void programRun() {
		randSet = randMaker();// Random���� �޼��忡 ���� HashSet
		iterKey = randSet.iterator();// HashSet�� �����Ͽ� ���� ����
		// while���� ���Ͽ� �Ҽ��� ���� ����
		printText();// System.out.println�� ���� ���� ����
		while (iterKey.hasNext()) {// ��������Ŀ���� ���� 0���� 1000������ ������ hashset���� �ް�,iterator�� ��ȯ�Ͽ� while������ �Ҽ����� Ȯ��
			int primeCount = 0;// ����� ���� �� ���ϴ� ��������
			int iterVal = iterKey.next();

			for (int i = 1; i <= iterVal; i++) {// �������� �Ѱ��� �Ҽ����� Ȯ��
				if (iterVal % i == 0) // iterKey.next()�� 1���� iterKey.next() �ڱ� �ڽ� ���� ����� 2���̸� �Ҽ��̱⶧���� ī��Ʈ
					primeCount++;
				if (primeCount > 2)
					break;
			} // for������
			if (primeCount == 2) {// �Ҽ��Ͻ� ArrayList�� ����ش�
				primeAr.add(iterVal);
				System.out.println("�Ҽ� �߰� : " + iterVal);
			} // �Ҽ���
		} // while�� ����
		System.out.println("------------------");
		maxMin = rankPrimeNum(primeAr);// �ּҰ� �ִ밪 ��ȯ �迭 �޼���
		printText(primeAr.size(), maxMin);

	}

	public static void main(String[] args) {
		PrimeNum pn = new PrimeNum();
		pn.programRun();

	}

}
