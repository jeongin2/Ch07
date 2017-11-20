import java.util.*;
public class Rain {
	public static void result(Vector<Integer> v) {
		int sum = 0;
		Iterator<Integer> iterator = v.iterator();
		while(iterator.hasNext()) {
			int n = iterator.next();
			sum += n;
		}
		System.out.print("현재 평균 :  " + sum/v.size());
	}
	public static void main(String[] args) {
		
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("강수량 입력 (0 입력시 종료)>>" );//강수량 입력받기
		while(true) {
			
			int n = scanner.nextInt();
			if(n == 0) {//0입력시 break
				System.out.println("종료합니다");
				break;
			}
				
			v.add(n);
			
			System.out.println(" ");
			result(v);
			System.out.println(" ");
		}
		
	}

}