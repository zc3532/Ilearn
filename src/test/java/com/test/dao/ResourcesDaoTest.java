package com.test.dao;

import com.ilearn.bean.ResourcesEntity;
import com.ilearn.dao.ResourcesDao;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by sl on 16-4-2.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath*:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath*:conf/springmvc.xml")
})


public class ResourcesDaoTest {

    @Autowired
    private ResourcesDao resourcesDao;// = new ResourcesDao();

    @Test
    public void testGetById(){
        ResourcesEntity v9Member = resourcesDao.getById(1001);
        System.out.println(v9Member.getRid());
        Assert.assertNotNull(v9Member);
//        Assert.assertEquals(v9Member.getUsername(),"tlyz@0330.com");
    }

    @Test
    public void testSaveResource(){
        resourcesDao.saveResource(1002,"a","b","cc");
        ResourcesEntity v9Member = resourcesDao.getById(1002);
        System.out.println(v9Member.getRid());
        Assert.assertNotNull(v9Member);
    }
}
