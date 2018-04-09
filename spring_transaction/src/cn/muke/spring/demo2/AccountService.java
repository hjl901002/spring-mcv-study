package cn.muke.spring.demo2;
/**
 * 转账案例的业务层接口.
 */
public interface AccountService {

	/**
	 * @param out : 转出的账户
	 * @param in  : 转入的账户
	 * @param money : 转账金额
	 */
	public void transfer(String out, String in, Double money);
}
