package com.day16;

//Generic

//타입 정의 안하면 Object타입
class Box<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
		
	}
	
	public T get() {
		return t;
	}
}


public class Test2 {

	public static void main(String[] args) {

		Box b1 = new Box();
		
		b1.set(30);//upcast
		Integer i = (Integer) b1.get();//downcast
		
		System.out.println(i);

		
		Box<Integer> b2 = new Box<Integer>();
		
		b2.set(10);//auto boxing
		b2.set(new Integer(10));//이게 정석
		Integer ii = b2.get();
		System.out.println(ii);
		
		Box<String> b3 = new Box<String>();
		b3.set("서울");
		//b3.add(10);
		String str = b3.get();
		System.out.println(str);
		
		
		
	}

}
