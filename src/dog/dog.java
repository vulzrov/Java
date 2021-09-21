package dog;

public class dog {
	/* 叫声、大小、名字 */
	protected int size;
	protected String name;
	protected String voice;
	
	/* 构造函数（1）：全参构造方法 */
	public dog (int s, String n, String vo){
		this.size = s;
		this.name = n;
		this.voice = vo;
	}
	
	/* 构造函数（2）：无参构造方法 */
	public dog () {
		this.size = 10;
		this.name = "Bob";
		this.voice = "Woof";
	}
	
	/* 属性接口 */
	  /* size属性 */
	public int getSize() {
		return this.size;
	}
	public void changeSize(int s) {
		this.size = s;
	}
	
	  /* size属性 */
	public String getName() {
		return this.name;
	}
	public void changeName(String n) {
		this.name = n;
	}
	
	  /* size属性 */
	public String getVoice() {
		return this.voice;
	}
	public void changeVoice(String vo) {
		this.voice = vo;
	}
	
	/* 制造叫声 */
	public void makeNoise() {
		System.out.printf("%1$s! %1$s! %1$s!", this.voice);
	}
	
}
