public class game_1 {
	private static int HP = 10;//현재 HP
	private static int MAXHP = 10;//최대 HP
	private static int LEVEL = 1;//현재 LEVEL
	private static int EXP = 1;//현재 EXP
	private static int MAXEXP = 10;//최대 EXP
	private static int DAMEGE = 1;//공격력
	
	private static int ENEMYlev = 1;//적 LEVEL
	private static int ENEMYhp = 10;//적 HP
	private static int ENEMYmaxhp = 10;//적 최대HP
	private static int ENEMYdam = 1;//적 공격력
	
	public static int not = 0, not2 = 0, not3 = 0;//클래스에서 함수를 구분하기 위한 인자값
	
	public static void game_1(String name) {
		Scan sc = new Scan();
		LevelUp lvu = new LevelUp();

		System.out.println(name);//output name
	    System.out.println("*********************************************************");//output *line
	    System.out.println("1. 공격  2. 휴식  3. 은신  4. 게임끝내기");//output 1. 공격  2. 휴식  3. 은신
	    
	    for(int input = 0, hide = 0 ;HP > 0 ;) {//input(입력한 숫자), hide(은신상태 확인)
	    	System.out.println("적hp : " + ENEMYhp);
	        System.out.println("hp : " + HP + "/" + MAXHP);//output hp/maxhp
	        System.out.println("level : " + LEVEL + "     " + "exp : " + EXP + "/" + MAXEXP);//output "level : " LEVEL "     exp : " EXP/MAXEXP
	        input = sc.Scan(input);//input <- input keyboard
	        
	        if(input == 3 && hide == 0) {//은신을 선택했을 경우
	            hide = 1;//hide <- 1
		        System.out.println("풀숲에 숨었습니다");//output 풀숲에 숨었습니다
		        System.out.println("적이 당신을 발견할 수 없게 되었습니다");//output 적이 당신을 발견할 수 없게 되었습니다
	            System.out.println("1. 아이템  2. 휴식  3. 기습  4. 게임 끝내기");//output 1. 공격  2. 휴식  3. 기습
	            input = 0;
	            
	        }
	        else {// 은신을 선택하지 않았을 경우
	           System.out.println("1. 공격  2. 휴식  3. 은신  4. 게임끝내기");//output 1. 공격  2. 휴식  3. 은신
	        }//else end
	        
	        if(input == 1) {//공격을 선택했을경우
	        	ENEMYhp -= DAMEGE;//ENEMYhp <- ENEMYhp - DAMEGE
	           System.out.println("적에게 " + DAMEGE + "의 대미지를 입혔습니다");//output 공격할 대상이 없습니다
	           
	           if(hide != 1) {//은신상태가 아닐경우
	        	   HP -= ENEMYdam+ENEMYlev;
	        	   System.out.println("적에게서 "+ (ENEMYdam+ENEMYlev) + "의 대미지를 입었습니다");//output 적에게서 ENEMYdam 의 대미지를 입었습니다
	           }//if end
	           hide = 0;//은신헤제
	        	   
	        }
	        
	        else if(input == 2) {//휴식을 선택했을경우
	           
	        	HP += 1;//hp <- hp + 1
	           if(HP >= MAXHP) {//HP가 너무 많이 찰경우
	        	   HP = MAXHP;//HP를 최대HP로 만든다
	        	   System.out.println("휴식으로 hp가 가득찼습니다");//output 휴식으로hp가 가득찼습니다
	           }//if end
	           else {//그렇지 않을경우
	        	   
	        	   System.out.println("휴식으로 hp가 1 올랐습니다");//output 휴식으로hp가 2 올랐습니다
	           }//else end
	           if(hide == 0) {//은신상태가 아닐경우
	        	   HP -= ENEMYdam+ENEMYlev;
	        	   System.out.println("적에게서 "+ (ENEMYdam+ENEMYlev) + "의 대미지를 입었습니다");//output 적에게서 ENEMYdam 의 대미지를 입었습니다
	           }//if end
	        }//else if end
	        
	        else if(hide == 1 && input == 3){//기습을 선택 했을경우
	           hide = 0;//hide <- 0(은신상태 해재)
	           ENEMYhp -= DAMEGE*2;
	           System.out.println("기습으로 적에게" + DAMEGE*2 + "의 대미지를 입혔습니다");


	        }//if end
	        if(input == 4) {//4를 입력했을 때
	        	return;//game 종료
	        }
	        
	        if(ENEMYhp <= 0) {// 적 HP가 0보다 작거나 같을때(적을 죽였을때)
	        	System.out.println("기습을 당한 적이 죽었습니다");//output 기습을 당한 적이 죽었습니다
		        System.out.println(ENEMYlev + "exp를 얻었습니다");//output 10exp를 얻었습니다
		        EXP += ENEMYlev;//exp <- exp + 10(exp 10 추가)
		        ENEMYhp = ENEMYmaxhp;// 적 hp 초기화

		        if(EXP >= MAXEXP) {//exp >= maxexp(exp가 가득 찼다면)
		        LEVEL = lvu.LevelUp(LEVEL);//levelup이벤트 실행
		        MAXHP = lvu.LevelUp(MAXHP, not, not2);//levelup이벤트 실행2
		        MAXEXP = lvu.LevelUp(MAXEXP, LEVEL);//levelup이벤트 실행 3
		        DAMEGE = lvu.LevelUp(DAMEGE, not, not2, not3);//levelup이벤트 실행 4
		        }//if end(levelup이벤트)
	        }//if end
	        
	    }//for end
	    System.out.println("죽었습니다 (tip.체력관리를 하면 쉽게 깰 수 있습니다)");//output 죽었습니다 (tip.체력관리를 하면 쉽게 깰 수 있습니다)
	}//Main end
	
}//game_1 end
