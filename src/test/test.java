package test;

import dog.*;

public class test {
	public static void main(String[] args) {
		poodle bob = new poodle();
		// dog bob = new poodle();
		// 这样写可以，体现了多态思想。
	    // 但是，不能用子类新定义的方法。重构的和父类直接继承的可以。
		// 原因很简单：内存空间分配。
		bob.changeVoice("Bark");
		bob.selfIntro();
	}
}
