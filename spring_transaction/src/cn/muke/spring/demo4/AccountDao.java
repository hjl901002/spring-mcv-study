package cn.muke.spring.demo4;
/**
 * 转账案例DAO层的接口
 */
public interface AccountDao {

	/**
	 * @param out   : 转出账户
	 * @param money : 转出金额
	 */
	public void outMoney(String out, Double money);
	
	/**
	 * @param in    : 转入账户
	 * @param money : 转入金额
	 */
	public void inMoney(String in, Double money);
}
