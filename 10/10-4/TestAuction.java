

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class TestAuction
{
	private double initPrice = 30.0;

	public void bid(String bidPrice)
		throws AuctionException
	{
		double d = 0.0;
		try
		{
			d = Double.parseDouble(bidPrice);
		}
		catch (Exception e)
		{
			//此处完成本方法中可以对异常执行的修复处理，此处仅仅是在控制台打印异常跟踪信息。
			e.printStackTrace();
			//再次抛出自定义异常
			throw new AuctionException("竞拍价必须是数值，不能包含其他字符！");
		}
		if (initPrice > d)
		{
			throw new AuctionException("竞拍价比起拍价低，不允许竞拍！");
		}
		initPrice = d;
	}

	public static void main(String[] args) 
	{
		TestAuction ta = new TestAuction();
		try
		{
			ta.bid("df");
		}
		catch (AuctionException ae)
		{
			//main方法再次捕捉到bid方法中的异常。并对该异常进行处理
			System.err.println(ae.getMessage());
		}
	}
}
