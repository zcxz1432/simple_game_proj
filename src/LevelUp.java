public class LevelUp implements TestSample{

	public int LevelUp(int level) {
		System.out.println("당신의 레벨이 올랐습니다");//output 당신의 레벨이 올랐습니다
	    return level += 1;		//level <- level + 1
	}

	public int LevelUp(int maxhp, int not, int not2) {
		return maxhp += 2; 		//maxhp <- maxhp + 2
	}

	public int LevelUp(int maxexp, int level) {
		return maxexp += (level*10);//levelup까지의 exp양 증가
	}
}