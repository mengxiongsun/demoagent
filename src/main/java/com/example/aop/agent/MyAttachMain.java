package com.example.aop.agent;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class MyAttachMain {
    public static void main(String[] args) throws IOException, AttachNotSupportedException, AgentLoadException, AgentInitializationException {
        VirtualMachine virtualMachine = VirtualMachine.attach(args[0]);
        try {
            virtualMachine.loadAgent("/Users/roka/Desktop/workspace/java/DemoAgent/target/DemoAgent-1.0-SNAPSHOT-jar-with-dependencies.jar");
        } finally {
            virtualMachine.detach();
        }
    }
}
