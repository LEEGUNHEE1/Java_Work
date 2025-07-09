package com.day13;

interface InterTest {
	int total();

	void write();

}

class InterTestImpl implements InterTest {

	private String hak, name;
	private int kor, eng;

	public InterTestImpl() {
	}

	public InterTestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public boolean equals(Object ob) {//upcast
		boolean flag =false;
		if (ob instanceof InterTestImpl) {
			InterTestImpl it = (InterTestImpl)ob;//downcast
			if (this.name.equals(it.name)&&this.hak.equals(it.hak)) {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public int total() {

		return kor + eng;
	}

	@Override
	public void write() {
		System.out.println(hak + " , " + name + " , " + total() + "점");
	}

}

public class Test8 {

	public static void main(String[] args) {
		
		InterTest ob1 = new InterTestImpl("111", "배수지", 80, 90);
		InterTest ob2 = new InterTestImpl("111", "배수지", 100, 100);
		
		if (ob1.equals(ob2)) {//Object
			System.out.println("ob1 과 ob2는 동일 인물");
		}else {
			System.out.println("ob1 과 ob2는 동일 인물 X");
		}
		
		ob1.write();
		ob2.write();
		

	}

}
