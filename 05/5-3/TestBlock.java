

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestBlock
{
	public static void main(String[] args) 
	{
		{
			//定义一个代码块局部变量a
			int a;
			//下面代码将出现错误，因为a变量还未初始化
			//System.out.println("代码块局部变量a的值：" + a);
			//为a变量赋初始值，也就是进行初始化
			a = 5;
			System.out.println("代码块局部变量a的值：" + a);
		}
		//下面试图访问的a变量并不存在
		//System.out.println(a);
	}
}
