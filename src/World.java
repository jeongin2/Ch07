import java.util.*;

public class World {
	public static void main(String[] args) {
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구수를 10개 입력하세요.");
		while(true) {
			System.out.print("나라 이름, 인구수 >> ");		
			String nation = scanner.next();
			if(nation.equals("그만"))//그만이 입력되면
				break; //break
			int people = scanner.nextInt();
			nations.put(nation, people);
		}
		
		while(true) {
			System.out.print("인구수 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만"))
				break;
			Integer n = nations.get(nation);//국가 얻어오기
			if(n == null)
				System.out.println(nation + " 나라는 없습니다.");
			else 
				System.out.println(nation + "의 인구는 " + n); //인구수 출력
		}
		
		scanner.close();
	}

}