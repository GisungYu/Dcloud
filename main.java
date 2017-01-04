package main;


public class main extends streambuffer {
	
	public static void main(String[] args){

	String temp = "";
	temp += "hello";
	temp += "";
	temp += "jump to java";
	System.out.println(temp);
	streambuffer t = new streambuffer();

	t.string();
	
	insert i = new insert();

	i.Insert();
	
	substring e = new substring();
	e.substring();
	}

}

class streambuffer{
	public void string(){
	StringBuffer sb =new StringBuffer();
	sb.append("hello");
	sb.append("");
	sb.append("jump to java");
	System.out.println(sb.toString());
	}
}

class insert {
	public void Insert(){
		StringBuffer cb = new StringBuffer();
		cb.append("jump to java");
		cb.insert(0, "hello");
		System.out.println(cb.toString());
	}
}

class substring{
	public void  substring(){
		StringBuffer bb = new StringBuffer();
		bb.append("Hello jump to java");
		System.out.println(bb.substring(0,4));
		
	}
}