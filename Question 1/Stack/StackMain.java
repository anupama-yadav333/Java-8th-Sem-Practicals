package stack;

import java.util.Scanner;

public class StackMain {

	private static int item;
	private static char yes= 'y';
	private static char menu= 'm';
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		StaticStack staticObj= new StaticStack();
		DynamicStack dynamicObj= new DynamicStack();
		
		do{
			int choice;
			System.out.println("Enter Your Choice\n" + "1.Static Stack\n" + "2.Dynamic Stack");
			choice= sc.nextInt();
			switch(choice){
				case 1: 
					int staticChoice;
									
					do{
						System.out.println("Enter Static Stack Choice\n" + "1.Push Elements\n" + "2.Pop Elements\n" + "3.Display Stack");
						staticChoice= sc.nextInt();
						switch(staticChoice){
							case 1:
								do{
									System.out.print("Enter Items to be Pushed : ");
									item= sc.nextInt();
									staticObj.pushElement(item);
									System.out.print("\nPress 'y' to Push More else press 'n' : ");
									yes= sc.next().charAt(0);
								}while(yes=='y');
								break;
								
							case 2:
								do{
									staticObj.popElement();
									System.out.print("\nPress 'y' to Pop More else press 'n' : ");
									yes= sc.next().charAt(0);
								}while(yes=='y');
								break;
								
							case 3:
								staticObj.display();
								break;
								
							default:
								System.out.println("Enter your Option");
								
						}
						System.out.println("Press y to continue to Static Stack Menu : ");
						yes= sc.next().charAt(0);
					}while(yes=='Y' || yes=='y');
					break;
					
				case 2:
					int dynamicChoice;
									
					do{
						System.out.println("Enter Dynamic Stack Choice\n" + "1.Push Elements\n" + "2.Pop Elements\n" + "3.Display Stack");
						dynamicChoice= sc.nextInt();
						switch(dynamicChoice){
							case 1:
								do{
									System.out.print("Enter Items to be Pushed : ");
									item= sc.nextInt();
									dynamicObj.pushElement(item);
									System.out.print("\nPress 'y' to Push More else press 'n' : ");
									yes= sc.next().charAt(0);
								}while(yes=='y');
								break;
								
							case 2:
								do{
									dynamicObj.popElement();
									System.out.print("\nPress 'y' to Pop More else press 'n' : ");
									yes= sc.next().charAt(0);
								}while(yes=='y');
								break;
								
							case 3:
								dynamicObj.display();
								break;
								
							default:
								System.out.println("Enter your Option");
								break;
								
						}
						System.out.println("Press y to continue to Dynamic Stack Menu : ");
						yes= sc.next().charAt(0);
					}while(yes=='Y' || yes=='y');
					break;
			}
			System.out.print("Press m or M to get back to Main Menu : ");
			menu= sc.next().charAt(0);
		}while(menu=='m' || menu=='M');
		
		sc.close();
	}

}
