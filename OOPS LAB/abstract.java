abstract class shape{
	public abstract void numberOfsides();
	}
		class Rectangle extends shape
		{
			public void numberOfsides()
			{
				System.out.println("Number of sides of rectangle=4");
			}
		}
		class Triangle extends shape
		{
			public void numberOfsides()
			{
				System.out.println("Number of sides of triangle=3");
			}
		}
		class Hexagon extends shape
		{
			public void numberOfsides()
			{
				System.out.println("Number of sides of hexagon=6");
			}
		}
	
	
	class test
	{
		public static void main (String args[])
		{
			Rectangle R=new Rectangle();
			Triangle T=new Triangle();
			Hexagon H=new Hexagon();
			R.numberOfsides();
			T.numberOfsides();
			H.numberOfsides();
	        }
	   }
OUTPUT
Number of sides of rectangle=4
Number of sides of triangle=3
Number of sides of hexagon=6

	
				
