
public class Solution {
	public static void main(String[] args) {
		double[] yArray = {45, 50, 39, 31, 34, 37, 36, 33, 34, 32, 24, 31, 25, 32, 21, 25, 31, 29, 35, 32, 39, 37, 33, 52, 41, 55, 40, 52, 44, 41, 43, 49, 50};
		int windowSize = 2;
		double[] filterY = new AverageFilter(windowSize,  yArray).filter();
		PolyFit polyFit = new PolyFit(yArray);
		polyFit.init();
		double[] res;
		res = polyFit.twoOrderFit();
		System.out.println("a="+res[0]);
		System.out.println("b="+res[1]);
		System.out.println("c="+res[2]);
	}

}
