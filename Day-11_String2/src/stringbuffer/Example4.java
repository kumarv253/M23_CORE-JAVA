package stringbuffer;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("jeva");
		System.out.println(s);
		System.out.println(s.charAt(1));
		
		s.setCharAt(1, 'a');
		System.out.println(s);
		System.out.println(s.charAt(1));

	}

}
