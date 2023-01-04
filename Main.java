package FcFs;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//get total process from user
		System.out.print("Enter process:");
		int process = input.nextInt(); //total process
		
		int burstTime[] = new int[process]; //burst time
		int ta[] = new int[process];     // turn around times
		int wt[] = new int[process];     // waiting times
		
		//get bust time from user
		int totalTA = 0;
		float wtAv = 0;
		for(int i = 0;i<process;i++)
		{
			System.out.print("Enter burst time for process "+(i+1)+":");
			burstTime[i] = input.nextInt();
			totalTA += burstTime[i];
			ta[i] = totalTA-0;
			
			wt[i] = totalTA-burstTime[i];
			wtAv+= wt[i];
		}
		
		
		float taT = 0;
        for(int i = 0;i<process;i++)
        {
        	taT += ta[i];
        }
		
		System.out.println("\n");
		System.out.println("---------------------------");
		System.out.println("P.Id\tB.T\tT.A\tW.T");
		System.out.println("---------------------------");
		for(int i = 0; i<process;i++)
		{
			System.out.println((i+1)+"\t"+burstTime[i]+"\t"+ta[i]+"\t"+wt[i]);
		}
		
		System.out.println("---------------------------");
		System.out.println("   Avarage process time");
		System.out.println("---------------------------");
		
		System.out.println("Avrg.T.A.T:"+(taT/process));
		System.out.println("Avrg.W.T:"+(wtAv/process));
		System.out.println("---------------------------");
		
		System.out.println("\n\n----------------------------------------------------------------");
		for(int i = 0; i<process; i++)
		{
			System.out.print("|\tp"+(i+1)+"\t");
			if(i+1 == process)
				System.out.print("|");
				
		}
		System.out.println("\n----------------------------------------------------------------");
		
		for(int i = 0;i<process;i++)
		{
			if(i == 0)
			{
				System.out.print(0+"\t  \t"+ta[i]);
			}else {
				System.out.print("\t  \t"+ta[i]);
			}
		}
		
	}
}
