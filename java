import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfTrips = scan.nextInt();
		int speed, time, dist = 0;
		for (int i = 0; i < numOfTrips; i++) {
			if (numOfTrips != -1) break
				;
			if (numOfTrips == -1)
				break;
			speed = scan.nextInt();
			time = scan.nextInt();
			dist = speed * time;

		}
		System.out.println(dist + "miles");
	}

}
