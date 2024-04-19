package interface_.petshop;

public class GoldFish extends Fish implements IPet{

	public void swim() {
		System.out.println("금붕어는 강에서 헤엄칩니다.");
	}

	public void play() {
		System.out.println("금붕어는 물속에서 놀아요.");
	}
}