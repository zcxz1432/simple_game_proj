public class Main {
	
	public static int input;
	public static String name;
	
	public static void main(String[]args) {
		Scan sc = new Scan();
		game_1 g1 = new game_1();
		game_2 g2 = new game_2();
		System.out.println("당신의 이름을 입력하세요");
		name = sc.Scan(name);//이름 입력
		
		
		for(;true;) {//무한반복
			System.out.println("하고싶은 게임을 입력하세요");
			System.out.println("1. 첫번째 게임, 2. 개발중");
			
			input = sc.Scan(input);//게임입력
			
			if(input == 1) {//1이 입력되엇으면
				g1.game_1(name);//게임 1 실행
				
			}//if end
			
			else if(input == 2) {
				g2.game_2(name);//게임 2 실행
			}//else if end
			
			System.out.println("다시하겠습니까?");
			System.out.println("1. 예  2. 아니요");
			
			input = sc.Scan(input);
			
			if (input == 1)
				continue;
			
			if (input == 2)
				break;
			
		}//if end
		
	}//main end
	
}//Main class end
