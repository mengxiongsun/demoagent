package com.example;

import java.lang.instrument.Instrumentation;

public class DemoAgent {
    public static void premain(String args, Instrumentation inst) {
        // premain()函数中注册MyClassFileTransformer转换器
        System.out.println("[DemoAgent] Agent successfully loaded!");
        inst.addTransformer(new DemoTransformer());
        System.out.println("DemoAgent initialized, args=" + StringUtil.toString(args));
    }
}

