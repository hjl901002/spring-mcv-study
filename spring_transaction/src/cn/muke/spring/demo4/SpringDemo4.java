package cn.muke.spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring声明式事务管理方式三：基于注解的事务管理方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {

	/**
	 * 注入代理类：因为代理类进行了增强的操作
	 */
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo4() {
		accountService.transfer("aaa", "bbb", 200d);
	}

}
