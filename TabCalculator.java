
public class TabCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double [] nums= new double [] {1.5, 2.4, 8.1, 1.4, 2.3, 11.1, 205.4, 9.8, 4.5, 22.2};

System.out.println(" Elementy tablicy");
System.out.println ( nums [0] + " "+ nums[1] + " "+ nums[2]+ " "+ nums[3]+ " "+ nums[4]+ " "+ nums[5]+ " "+ nums[6]+ " "+ nums[7]+ " "+ nums[8]+ " "+ nums[9] );

double sum= nums[0]+ nums [2]+ nums [4]+ nums[6]+ nums[8];  

System.out.println( "Suma elementów na indeksach nieparzystych: " + sum);


System.out.println("Ostatni element tablicy:" + nums [nums.length-1]);

	}

}
