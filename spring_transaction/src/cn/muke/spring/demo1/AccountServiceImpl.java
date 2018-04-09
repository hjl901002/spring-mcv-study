package cn.muke.spring.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.sun.istack.internal.FinalArrayList;

/**
 * 转账案例的业务层实现类.
 */
public class AccountServiceImpl implements AccountService {

	//注入转账DAO的类
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	//注入事务管理的模板
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	/**
	 * @param out : 转出的账户
	 * @param in  : 转入的账户
	 * @param money : 转账金额
	 * 从java8开始 参数中的final关键字可省略，但用法和之前版本一样
	 */
	@Override
	public void transfer(final String out, final String in, final Double money) {
		/*accountDao.outMoney(out, money);
		int i = 1 / 0;
		accountDao.inMoney(in, money);*/
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.outMoney(out, money);
				int i = 1 / 0;
				accountDao.inMoney(in, money);
			}
		});
	}

}
