package com.effective.chapter2.artic3;

//枚举实现单例模式
public enum RealInstance {
        INSTANCE;


        public void become(){
            System.out.println("成为单例");
        }
}
