package hacker.rank.programs;

public class JumpingOnClouds {

	public static void main(String[] args) {
		int c[] = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0};
		int result = jumpingOnClouds(c);
		System.out.println(result);

	}

	public static int jumpingOnClouds(int[] c) {
		int count = 0;
		boolean flag = false;
		for (int i = 0; i <= c.length - 2; i++) {

			if (c[i] == c[i + 1] && c[i] == 0) {
				if (!flag) {
					flag = true;
					count++;
				}
			} else if (c[i] != c[i + 1] && c[i] == 1) {
				flag=false;
				count++;
			}

		}
		return count;

	}

}
