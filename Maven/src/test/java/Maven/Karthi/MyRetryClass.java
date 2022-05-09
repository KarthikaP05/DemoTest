package Maven.Karthi;

public class MyRetryClass {
	int count = 1;
	int limit = 10;
	
	public boolean retry() {
		if (count < limit) {
			count++;
			return true;
		}
		else {
			return false;
		}
	}
}