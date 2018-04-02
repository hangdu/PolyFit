
public class AverageFilter {
	int windowSize;
	double[] yArray;
	public AverageFilter(int size, double[] array) {
		windowSize = size;
		yArray = array;
	}
	
	double[] filter() {
		double[] res = new double[yArray.length];
		for (int i = windowSize-1; i < res.length; i++) {
			//find res[i]
			double temp = 0;
			for (int j = i+1-windowSize; j <= i; j++) {
				temp += yArray[j];
			}
			res[i] = temp/windowSize;
		}
		
		for (int i = 0; i <  windowSize-1; i++) {
			res[i] = yArray[i];
		}
		return res;
	}
}
