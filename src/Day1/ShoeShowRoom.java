package Day1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShoeShowRoom {
	
	//Autowiring by Type
//	@Autowired
//	Shoe s1;
//	
	//Shoe s2;

	//Autowiring by Name
	@Autowired
	@Qualifier("newshoearr")
	Shoe s2[] = new Bata[10];

//	public ShoeShowRoom(int count) {
//		for(int i = 0; i < s2.length; i++){
//			this.s2[i] = new Bata(i);
//		}
//	}
	
	List<Shoe> shoes;
	
	
	
	
}
