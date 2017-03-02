package stack;

public class StaticStack extends Stack {

	int arraySize= 5;
	int arrayStack[]= new int[arraySize];
	int topOfStack= -1;
	
	@Override
	void pushElement(int item) {

		try{
			if(topOfStack > arraySize){
				System.out.println("Stack OverFlow");
			}else{
				arrayStack[++topOfStack]= item;
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	@Override
	void popElement() {
		
		if(topOfStack < 0){
			System.out.println("Stack is Empty Now");
		}else{
			topOfStack--;
		}
	}

	@Override
	void display() {
		
		if(topOfStack < 0){
			System.out.println("Nothing to Display");
		}else{
			for(int i=0; i<=topOfStack; i++){
				System.out.println("Stack Elements : " + arrayStack[i]);
			}
		}
		
	}

	
	
}
