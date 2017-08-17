package org.trc.designmode.mode01;

/**
 * 初级会员折扣类
 * Created by wangyz on 2017/8/17.
 */

public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
