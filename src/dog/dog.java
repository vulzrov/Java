package dog;

public class dog {
	/* ��������С������ */
	protected int size;
	protected String name;
	protected String voice;
	
	/* ���캯����1����ȫ�ι��췽�� */
	public dog (int s, String n, String vo){
		this.size = s;
		this.name = n;
		this.voice = vo;
	}
	
	/* ���캯����2�����޲ι��췽�� */
	public dog () {
		this.size = 10;
		this.name = "Bob";
		this.voice = "Woof";
	}
	
	/* ���Խӿ� */
	  /* size���� */
	public int getSize() {
		return this.size;
	}
	public void changeSize(int s) {
		this.size = s;
	}
	
	  /* size���� */
	public String getName() {
		return this.name;
	}
	public void changeName(String n) {
		this.name = n;
	}
	
	  /* size���� */
	public String getVoice() {
		return this.voice;
	}
	public void changeVoice(String vo) {
		this.voice = vo;
	}
	
	/* ������� */
	public void makeNoise() {
		System.out.printf("%1$s! %1$s! %1$s!", this.voice);
	}
	
}
