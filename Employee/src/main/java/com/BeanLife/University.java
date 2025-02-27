package com.BeanLife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class University  implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "University  {" +
                "name= '" + name + '\'' +
                '}';
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        // Instantiated
        //System.out.println("University Initilization ");
    }

    @Override
    public void destroy() throws Exception {
        //destroy
       // System.out.println("Going to University ");

    }


}
