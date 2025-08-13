package com.aaslin.spring.BeanLifecycleInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TeacherInterface implements InitializingBean, DisposableBean {

    public TeacherInterface() {
        System.out.println("TeacherInterface Constructor: Bean instance created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TeacherInterface afterPropertiesSet(): InitializingBean called");
    }

 
    @Override
    public void destroy() throws Exception {
        System.out.println("TeacherInterface destroy(): DisposableBean called");
    }

	public void teach() {
		// TODO Auto-generated method stub
        System.out.println("TeacherInterface teach(): Teaching in progress...");

	}
}
