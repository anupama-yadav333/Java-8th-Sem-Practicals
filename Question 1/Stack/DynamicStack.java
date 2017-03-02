package stack;

import java.util.ArrayList;
import java.util.List;

public class DynamicStack extends Stack{

	List<Integer> list= new ArrayList<>();
	
	@Override
	void pushElement(int item) {
		// TODO Auto-generated method stub
		list.add(item);
	}

	@Override
	void popElement() {
		// TODO Auto-generated method stub
		if(list.isEmpty()){
			System.out.println("List is Empty Push Elements to POP");
		}else{
			list.remove(list.size()-1);
		}
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		if(list.isEmpty()){
			System.out.println("Array List is Empty");
		}
		for(int i=0; i<list.size(); i++){
			System.out.println("Array List Elements : " + list.get(i));
		}
	}

	

}
