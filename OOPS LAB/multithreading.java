import java .util.*; 
class EvenThread extends Thread	{
	private int num;
	public EvenThread(int num)
		{
			this.num=num;
		}
		public void run()
		{
			System.out.println("square of"+num +"="+(num*num));
		}
	}
		class OddThread extends Thread
		{
			private int num;
			public OddThread (int num)
				{
					this.num=num;
				}
			public void run()
				{
					System.out.println("cube of"+num +"="+(num*num*num));
				}
		}
class RandomThread extends Thread
		{
			public void run()
				{
					Random r=new Random();
					for (int i=0;i<10;i++)
				{
			int num=r.nextInt(100);
			if (num%2==0){
			new EvenThread (num).start();
			}
			else{
			new OddThread(num).start();
			}
			}
			}
			}
			
			class multithreading{
			public static void main(String args[])
			{
			RandomThread r=new RandomThread();
			r.start();
			}
			}
			
		
