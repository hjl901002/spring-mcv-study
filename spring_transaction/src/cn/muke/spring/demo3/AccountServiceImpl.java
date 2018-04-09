package cn.muke.spring.demo3;


/**
 * 转账案例的业务层实现类.
 */
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
