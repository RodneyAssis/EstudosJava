package arraycollection.collection;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> u1 = new HashSet<>();
		
		u1.add(new Usuario("kaio"));
		u1.add(new Usuario("may"));
		u1.add(new Usuario("leo"));
	
		boolean res = u1.contains(new Usuario("yam"));
		
		System.out.println(res);
	}
}
