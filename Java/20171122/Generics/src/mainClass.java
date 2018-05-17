
public class mainClass {

	public static void main(String[] args) {
		/*
		Box b = new Box(123);
		
		Integer i = (int)b.getObj();
		
		System.out.println(i);
		
		Box sb = new Box("Hello");
		String str = (String)sb.getObj();
		System.out.println(str);
		*/
		
		Box<Integer> b = new Box<Integer>(234);
		int num = b.getT();
		System.out.println(num);
		
		Box<String> strB = new Box<String>("가나다");
		String str = strB.getT();
		System.out.println(str);
		
		Box2<String, Double> box2 = new Box2<String, Double>("Hello",123.456);
		String str2 = box2.getT();
		Double d = box2.getA();
		
		System.out.println(str2+"   "+d);
		
	}
}

/*class Box{
	Object obj;

	public Box(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
	
	
}*/

///////////////////////////////////
//Generic == 자료형 변수 
class Box<T>{ // T == Template(형태)
	T t;
	
	public Box(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
}

class Box2<T, A>{
	T t;
	A a;
	public Box2(T t, A a) {
		super();
		this.t = t;
		this.a = a;
	}
	public T getT() {
		return t;
	}
	public A getA() {
		return a;
	}
	
	
}