package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lanceur {
	
	public static void main(String[] args0) {
		Chien medor = new Chien();
		Pigeon olaf = new Pigeon();
		Chien ursule = new Chien();
		
		System.out.println("medor.communiquer() : ");
		medor.communiquer();
		System.out.println("ursule.communiquer() : ");
		ursule.communiquer();
		System.out.println("olaf.communiquer() : ");
		olaf.communiquer();
		
		System.out.println("olaf combat : ");
		System.out.println(olaf.combat());
		System.out.println("medor combat : ");
		System.out.println(medor.combat());
		
		System.out.println("medor.seNourrir(fromage) : ");
		medor.seNourrir("fromage");
		System.out.println("medor.seNourrir(croquettes) : ");
		medor.seNourrir("croquettes");
		
		System.out.println("medor.compareTo(olaf) : ");
		System.out.println(medor.compareTo(olaf));
		System.out.println("medor.compareTo(medor) : ");
		System.out.println(medor.compareTo(medor));
		System.out.println("medor.compareTo(ursule) : ");
		System.out.println(medor.compareTo(ursule));
		
		System.out.println("-------------Iterator----------------------");
		
		List ls = new ArrayList();
		ls.add(medor);
		ls.add(olaf);
		ls.add(ursule);
		
		Collections.sort(ls);
		Iterator itr =  ls.iterator();
		 
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element + "\n");
             
        }
	}
}
