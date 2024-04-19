package interface_.petshop;

public class Dog extends Animal implements IPet{

	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
	public void play() {
		System.out.println("개는 밖에서 놀아요.");
	}
}
