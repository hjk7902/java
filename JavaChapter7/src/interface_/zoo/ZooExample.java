package interface_.zoo;

public class ZooExample {

	public static void main(String[] args) {
        // Tiger 테스트
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.makeSound();

        // Cat 테스트
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.makeSound();

        // Dog 테스트
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();

        // Fish 테스트
        Fish fish = new Fish();
        fish.eat();
        fish.sleep();

        // GoldFish 테스트
        GoldFish goldFish = new GoldFish();
        goldFish.eat();
        goldFish.sleep();

        // Shark 테스트
        Shark shark = new Shark();
        shark.eat();
        shark.sleep();

        // PetCat 테스트
        PetCat petCat = new PetCat();
        petCat.eat();
        petCat.sleep();
        petCat.makeSound();
        petCat.play();

        // PetDog 테스트
        PetDog petDog = new PetDog();
        petDog.eat();
        petDog.sleep();
        petDog.play();
	}

}

//Animal 인터페이스
interface Animal {
	void eat();
	void sleep();
}

//추상클래스
abstract class Feline implements Animal {
	abstract void makeSound();
}

//클래스들
class Tiger extends Feline {
	@Override
	public void eat() {
		System.out.println("Tiger is eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Tiger is sleeping...");
	}

	@Override
	void makeSound() {
		System.out.println("Tiger is roaring...");
	}
}

class Cat extends Feline {
	@Override
	public void eat() {
		System.out.println("Cat is eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping...");
	}

	@Override
	void makeSound() {
		System.out.println("Cat is meowing...");
	}
}

class Dog implements Animal {
	@Override
	public void eat() {
		System.out.println("Dog is eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping...");
	}
}

class Fish implements Animal {
	@Override
	public void eat() {
		System.out.println("Fish is eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Fish is sleeping...");
	}
}

class GoldFish extends Fish {
	// GoldFish에 특화된 메서드나 속성을 추가할 수 있음
}

class Shark extends Fish {
	// Shark에 특화된 메서드나 속성을 추가할 수 있음
}

//Pet 인터페이스
interface Pet {
	void play();
}

//특정 동물을 펫으로 만들기 위한 클래스들
class PetCat extends Cat implements Pet {
	@Override
	public void play() {
		System.out.println("PetCat is playing with its owner...");
	}
}

class PetDog extends Dog implements Pet {
	@Override
	public void play() {
		System.out.println("PetDog is playing fetch with its owner...");
	}
}
