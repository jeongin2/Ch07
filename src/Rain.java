import java.util.*;
public class Rain {
	public static void result(Vector<Integer> v) {
		int sum = 0;
		Iterator<Integer> iterator = v.iterator();
		while(iterator.hasNext()) {
			int n = iterator.next();
			sum += n;
		}
		System.out.print("���� ��� :  " + sum/v.size());
	}
	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է� (0 �Է½� ����)>>" );//������ �Է¹ޱ�
		while(true) {
			
			int n = scanner.nextInt();
			if(n == 0) {//0�Է½� break
				System.out.println("�����մϴ�");
				break;
			}
				
			v.add(n);
			
			System.out.println(" ");
			result(v);
			System.out.println(" ");
		}
		
	}

}