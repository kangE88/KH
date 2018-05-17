package main;

public class MyTv2 {

	public static void main(String[] args) {
		
		Mytv tv = new Mytv();
		
		//setter
		tv.setPower(true);
		tv.setChannel(20);
		tv.setVolume(50);
		
		boolean onoff = false;
		int chanel =0;
		int volume =0;
		
		System.out.println(tv.getthis());
		
		// getter 셋팅 값 가져오기
		onoff = tv.isPower();
		chanel = tv.getChannel();
		volume = tv.getVolume();
		
		if(onoff) {
			System.out.println("Power on");
		}else {
			System.out.println("Power off");
		}
		System.out.println("chanel== "+chanel);
		System.out.println("volume== "+volume);	
		
		tv.method();
		
	}
}

/*
 *  this 포인터(참조)
 *  자기 자신을 가리키는 참조
 * 
 * 
 * */


class Mytv{
	private boolean power =false;
	private int channel=0;
	private int volume=0;
	
	//const == 상수(변하지 않는 값) const int i = 23; define enum
	final int i = 12;
	
	public void method() {
		int b = i;
		System.out.println(b);
	}
	
	public Mytv getthis() {
		return this;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	/*
	void setPower(boolean b) {
		power = b;
	}
	boolean getPower() {
		return power;
	}
	*/
	
	/*void setPower(boolean power) {
		this.power = power;
	}
	
	boolean getPower() {
		return power;
	}
	
	
	
	////////////////////////////////
	
	

	//채널 set/get
	void setChannel(int i) {
		channel = i;
	}
	int getChannel() {
		return channel;
	}
	
	//volume set/get	
	void setVolume(int i) {
		volume = i;
	}
	int getVolume() {
		return volume;
	}
	*/
	
	
	
	
}
