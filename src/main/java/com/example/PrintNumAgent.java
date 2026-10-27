package com.example;

import com.example.agent.PrintNumTransformer;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

public class PrintNumAgent {
    public static void agentmain (String agentArgs, Instrumentation inst) throws UnmodifiableClassException {
        System.out.println("agentmain---test stared: ");
        inst.addTransformer(new PrintNumTransformer(), true);

        Class[] allLoadedClasses = inst.getAllLoadedClasses();
        for (Class allLoadedClass : allLoadedClasses) {
            if (allLoadedClass.getSimpleName().equals("PrintNumTest")) {
                System.out.println("agentmain---loaded: " + allLoadedClass.getName());
                inst.retransformClasses(allLoadedClass);
                break;
            }
        }
    }
}
