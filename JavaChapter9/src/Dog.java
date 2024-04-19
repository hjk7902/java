public class Dog extends Object {
	String dogId;
	String dogName;

	public Dog(String dogId, String dogName) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
	}
	
	public String toString() {
		return dogId + " : " + dogName;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;

		//상속관계 있으면 데이터가 같더라도 다른 객체
		if (getClass() != obj.getClass()) return false;

		Dog d = (Dog)obj;
		if(this.dogId.equals(d.dogId) && this.dogName.equals(d.dogName) ) {
			return true;
		}else {
			return false;
		}
	}

	public int hashCode() {
		return dogId.hashCode() ^ dogName.hashCode();
	}
}