package Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnShoe {

	public static void main(String[] args) {
		
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext(AppConfig.class);
		//Shoe s = appCtxt.getBean(Bata.class);
		
//		Shoe s = (Shoe) appCtxt.getBean("newshoe");
//		s.makeShoeComfortable();
//		
//		Shoe s2 = (Shoe) appCtxt.getBean("newshoe");
//		s2.makeShoeComfortable();
//		
//		//s.setPrice(100);
//		//s2.setPrice(200);
//		
//		System.out.println(s.getPrice());
//		System.out.println(s2.getPrice());
		
		ShoeShowRoom ssr = (ShoeShowRoom) appCtxt.getBean("ssr");
		//ssr.s1.makeShoeComfortable();
		for(int i =0; i < ssr.s2.length ; i++){
		   ssr.s2[i].makeShoeComfortable();
		   System.out.println(ssr.s2[i].getPrice());
		}
		
		ShoeShowRoom ssr2 = (ShoeShowRoom) appCtxt.getBean("ssr");
		//ssr.s1.makeShoeComfortable();
		for(int i =0; i < ssr2.s2.length ; i++){
		   ssr2.s2[i].makeShoeComfortable();
		   System.out.println(ssr2.s2[i].getPrice());
		}

	}

}
