import java.util.*;

public class World {
	public static void main(String[] args) {
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α����� 10�� �Է��ϼ���.");
		while(true) {
			System.out.print("���� �̸�, �α��� >> ");		
			String nation = scanner.next();
			if(nation.equals("�׸�"))//�׸��� �ԷµǸ�
				break; //break
			int people = scanner.nextInt();
			nations.put(nation, people);
		}
		
		while(true) {
			System.out.print("�α��� �˻� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			Integer n = nations.get(nation);//���� ������
			if(n == null)
				System.out.println(nation + " ����� �����ϴ�.");
			else 
				System.out.println(nation + "�� �α��� " + n); //�α��� ���
		}
		
		scanner.close();
	}

}