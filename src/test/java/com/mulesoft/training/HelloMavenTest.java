package com.mulesoft.training;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloWorld() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello World!");
    }
    
    @Override
    protected String getConfigFile() {
        return "advanced-maven-project.xml";
    }

}
