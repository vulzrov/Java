package dog;

public class poodle extends dog{
	/* 力量决定速度和跳跃高度 */
	protected int strength;
	
	/* 新的参数接口 */
	public int getStrength() {
		return this.strength;
	}
	public void changeStrength(int pow) {
		this.strength = pow;
	}
	
	/* 新的构造函数 */
	public poodle() {
		super(); // 无参构造是可以省略这行的。编译器自动执行。
		this.strength = 10;
	}
	public poodle(int s, String n, String vo, int pow) {
		super(s,n,vo); /* 有参构造就必须显示调用父类构造函数。
		 				  虽然说其实可以...自动执行父类的无参构造。*/
		this.strength = pow;
	}
	
	/* 新方法：跑多快跳多高 */
	public void selfIntro() {
		System.out.printf("%3$s! %3$s!\nMy name is %2$s.\n"
				+ "I am %1$d meters long.\nI can jump %4$d meters high!", 
				this.size, this.name, this.voice, this.strength);
	}
	
}
