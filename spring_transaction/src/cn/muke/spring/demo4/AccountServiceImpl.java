package cn.muke.spring.demo4;

import org.springframework.transaction.annotation.Transactional;

/**
 * 转账案例的业务层实现类.
 */
/**
 * @Transactional注解中的属性
 * propagation ：事务传播行为
 * isolation   ：事务隔离级别
 * readOnly		：只读
 * noRollbackFor ：发生哪些异常时事务不会回滚
 * noRollbackForClassName ：按异常类的名称指明，发生哪些异常时事务不会回滚
 * rollbackFor	：发生哪些异常时事务会回滚
 * rollbackForClassName ：按异常类的名称指明，发生哪些异常时事务会回滚
 * timeout	：超时
 * transactionManager ：事务管理器
 * value 
 */
@Transactional
public class AccountServiceImpl implements AccountService {

	//注入转账DAO的类
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * @param out : 转出的账户
	 * @param in  : 转入的账户
	 * @param money : 转账金额
	 */
	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		int i = 1 / 0;
		accountDao.inMoney(in, money);
	}

}
