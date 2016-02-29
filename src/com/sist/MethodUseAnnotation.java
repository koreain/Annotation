package com.sist;

/**
 * Created by aa on 2016-02-29.
 */

public class MethodUseAnnotation {
    @PrintAnnotation
    public void methodName(){
        System.out.println("어노테이션 적용 메서드1 내용");
    }
    @PrintAnnotation("*")
    public void methodName2(){
        System.out.println("어노테이션 적용 메서드1 내용");
    }
    @PrintAnnotation(value = "$", number = 100)
    public void methodName3(){
        System.out.println("어노테이션 적용 메서드1 내용");
    }
}
