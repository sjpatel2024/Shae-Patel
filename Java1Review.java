import java.util.function.BooleanSupplier;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}

	public static Double divide(double d, double e) {
		return d/ e;
	
	}
	
	public static int divide (int a , int b)
	{
	return a/b;	
	}

	public static boolean isDivisibleBy7(int i) {
		if(i % 7 == 0)
		{
			return true;
		}
		return false;
		
	}

	public static Integer findMin(int num1, int num2, int num3) {
		int min = num1;
		
		if(min > num2)
		{
			min = num2;
		}
		if(min > num3)
		{
			min = num3;
		}
		return min;
	}

	public static Integer findMin(int[] array) {
		int min = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if(min > array[i])
			{
				min = array[i];
			}
		}
		return min;
	}

	public static Double average(int[] array) {
		
		double sum = 0;
		for(int i = 0; i < array.length; i ++)
		{
			sum = sum + array[i];
		}
		
		double length = array.length;
		
		return sum/length;
	}

	public static void toLowerCase(String[] strings) {
		for(int i = 0; i < strings.length; i++)
		{
			if(strings[i] != null)
			{
				strings[i] = strings[i].toLowerCase()
;			}
		}
		
	}

	public static Object[] toLowerCaseCopy(String[] strings) {
		if(strings == null)
		{
			throw new IllegalArgumentException("Input array cannot be null");
		}
		String[] lowerCaseArray = new String[strings.length];
		
		for(int i = 0; i < strings.length; i++)
		{
			if(strings[i] != null)
			{
				lowerCaseArray[i] = strings[i].toLowerCase();
			}
			else
			{
				lowerCaseArray[i] = null;
			}
		}
		return lowerCaseArray;
	}

	public static void removeDuplicates(int[] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i < array.length; i++)
		{
			boolean isDuplicate = false;
			for(int j = i + 1; j < array.length; j++)
			{
				if(array[i] == array[j])
				{
					isDuplicate = true;
					array[j]=0;
				}
			}
			
			if(isDuplicate)
			{
				array[i]=0;
			}
		}
		
	}

	public static Object main(String string) {
		// TODO Auto-generated method stub
		
		return "Overloaded main method was passed \"" + string +"\".";
	}

	
	
	
	
	
	
	
	
	

	
}
