package test.com.liu; 

import com.liu.Application;
import com.liu.User;
import com.liu.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import javax.annotation.Resource;

/** 
* testTest Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 18, 2017</pre> 
* @version 1.0 
*/
@SpringApplicationConfiguration(classes = Application.class)
public class testTestTest {
    @Resource
private UserMapper userMapper;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

@Test
    public void findByName()throws Exception
{
//    userMapper.insert("AAAA",20);
//    User u=userMapper.findByName("AAAA");
//    Assert.assertEquals(20,u.getAge());
    System.out.println("out");
}

} 
