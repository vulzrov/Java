package dog;

public class poodle extends dog{
	/* ���������ٶȺ���Ծ�߶� */
	protected int strength;
	
	/* �µĲ����ӿ� */
	public int getStrength() {
		return this.strength;
	}
	public void changeStrength(int pow) {
		this.strength = pow;
	}
	
	/* �µĹ��캯�� */
	public poodle() {
		super(); // �޲ι����ǿ���ʡ�����еġ��������Զ�ִ�С�
		this.strength = 10;
	}
	public poodle(int s, String n, String vo, int pow) {
		super(s,n,vo); /* �вι���ͱ�����ʾ���ø��๹�캯����
		 				  ��Ȼ˵��ʵ����...�Զ�ִ�и�����޲ι��졣*/
		this.strength = pow;
	}
	
	/* �·������ܶ������� */
	public void selfIntro() {
		System.out.printf("%3$s! %3$s!\nMy name is %2$s.\n"
				+ "I am %1$d meters long.\nI can jump %4$d meters high!", 
				this.size, this.name, this.voice, this.strength);
	}
	
}
