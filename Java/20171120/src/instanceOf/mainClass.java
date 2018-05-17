package instanceOf;

public class mainClass {

	public static void main(String[] args) {
		
		superClass arrSu[] = new superClass[3];
		
		arrSu[0] = new childClass01();
		arrSu[1] = new childClass02();
		
		//childClass01 cc = (childClass01)arrSu[0];
		//cc.method();
		
		//arrSu[0].superMethod();
		
		
		
		//instanceOf
		for (int i = 0; i < arrSu.length; i++) {
			if(arrSu[i] != null) {
				doWork(arrSu[i]);
			}
		}
		
		
	}
	public static void doWork(superClass sc) {
		if(sc instanceof childClass01) {
			childClass01 cc = (childClass01)sc;
			cc.method();
			cc.superMethod();
		}else if(sc instanceof childClass02) {
			childClass02 cc = (childClass02)sc;
			cc.func();
			cc.superMethod();
		}
	}

}
