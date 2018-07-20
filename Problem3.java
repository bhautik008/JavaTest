package test1;

public class Problem3 {
	
	public static void main(String[] args) {
		int[] ary = {1, 1, 2, 4, 1};
		System.out.println("Does array has sequence 1,2,3? "+ check(ary));
	}
	
	private static boolean check(int[] ary) {
		for(int i=0;i<ary.length-2;i++) {
			if(ary[i] == 1) {
				if(ary[i+1] == 2 && ary[i+2] == 3) {
					return true;
				}
			}
		}
		return false;
	}
}
