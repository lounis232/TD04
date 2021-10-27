package liste_chainee;

import static org.junit.Assert.assertEquals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyList l = new MyList();
		l.add("LOUNIS");
		l.addLast("LOUNIS");
		l.add("LOUNIS-2");
		l.add("LOUNIS-3");
		l.addLast("LOUNIS-6");
		l.add("LOUNIS-4");
		l.add("test",6);
		System.out.println(l.toString()); 
		System.out.println(l.get(5)); 
		System.out.println(l.sumLetter());
	}

}
