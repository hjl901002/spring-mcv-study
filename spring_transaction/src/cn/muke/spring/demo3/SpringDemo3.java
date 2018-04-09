package cn.muke.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring声明式事务管理方式二：基于AspectJ的XML方式的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {

	/**
	 * 注入代理类：因为代理类进行了增强的操作
	 */
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo3() {
		accountService.transfer("aaa", "bbb", 200d);
	}

}
