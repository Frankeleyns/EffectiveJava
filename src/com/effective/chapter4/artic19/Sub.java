package com.effective.chapter4.artic19;

public class Sub extends Super{
    private String init;

    Sub() {
        init = "初始化";
        System.out.println("子类构造器");
    }

    @Override
    public void overrideMe() {
        System.out.println("子类overrideMe()");
        System.out.println(init);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}

/**
 * 运行结果为：
 *
 * 父类构造器
 * 子类overrideMe()
 * null
 * 子类构造器
 * 子类overrideMe()
 * 初始化
 *
 * 这个例子提醒我们父类构造器不要调用能被覆盖的方法，因为父类的构造器在子类构造器之前执行，子类中的覆盖方法
 * 将会比子类构造器先执行，如果该覆盖方法依赖子类构造器初始化值，则会产生null，如果不是使用 String
 * 而是一个对象，则会产生空指针异常。
 *
 */
