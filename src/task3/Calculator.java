package task3;
import java.io.*;
import java.util.*;
public class Calculator {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("This is a Calculator that allows both int and float operands.");
		while(true)
		{
			System.out.println("\nEnter 1 for Integer operations and 2 for Floating Point Operations : ");
			int choice=Integer.parseInt(br.readLine());
			if(choice==1)
			{
				System.out.println("\nEnter 2 Integers separated by space: ");
				String[] inp=br.readLine().split(" ");
				int a=Integer.parseInt(inp[0]);
				int b=Integer.parseInt(inp[1]);
				System.out.println("\nEnter the operation to be performed : 1.Addition  2.Subtraction  3.Multiplication  4.Division : ");
				choice=Integer.parseInt(br.readLine());
				switch(choice)
				{
					case 1:{
						Addition add=new Addition();
						DisplayResult print=new DisplayResult();
						add.operation(a, b);
						print.display(add.sum);
						break;
					}
					
					case 2:{
						Subtraction sub=new Subtraction();
						DisplayResult print=new DisplayResult();
						sub.operation(a, b);
						print.display(sub.diff);
						break;
					}
					
					case 3:{
						Multiplication mul=new Multiplication();
						DisplayResult print=new DisplayResult();
						mul.operation(a, b);
						print.display(mul.prod);
						break;
					}
					
					case 4:{
						Division div=new Division();
						DisplayResult print=new DisplayResult();
						div.operation(a, b);
						print.display(div.quotient);
						break;
					}
				}
				
			}
			
			else {
				System.out.println("\nEnter 2 Decimal Numbers separated by space: ");
				String[] inp=br.readLine().split(" ");
				float a=Float.parseFloat(inp[0]);
				float b=Float.parseFloat(inp[1]);
				System.out.println("\nEnter the operation to be performed : 1.Addition  2.Subtraction  3.Multiplication  4.Division : ");
				choice=Integer.parseInt(br.readLine());
				switch(choice)
				{
					case 1:{
						AdditionFloat add=new AdditionFloat();
						DisplayFloatResult print=new DisplayFloatResult();
						add.floatOperate(a, b);
						print.display(add.sum);
						break;
					}
					
					case 2:{
						SubtractionFloat sub=new SubtractionFloat();
						DisplayFloatResult print=new DisplayFloatResult();
						sub.floatOperate(a, b);
						print.display(sub.diff);
						break;
					}
					
					case 3:{
						MultiplicationFloat mul=new MultiplicationFloat();
						DisplayFloatResult print=new DisplayFloatResult();
						mul.floatOperate(a, b);
						print.display(mul.prod);
						break;
					}
					
					case 4:{
						DivisionFloat div=new DivisionFloat();
						DisplayFloatResult print=new DisplayFloatResult();
						div.floatOperate(a, b);
						print.display(div.quotient);
						break;
					}
				}
			}
			System.out.println("\nEnter 1 to quit and 2 to continue : ");
			choice=Integer.parseInt(br.readLine());
			if(choice==1)
			{
				break;
			}
		}
	}

}
