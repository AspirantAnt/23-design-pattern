package org.example.design.behavioral.responsibility.separate;

import java.math.BigDecimal;

/**
 *  主任处理
 *
 * Author: GL
 * Date: 2021-10-31
 */
public class DirectorFinanceHandler extends FinanceHandler<Double> {
    // 可批准金额
    private final BigDecimal money;

    public DirectorFinanceHandler(Double weight, BigDecimal money) {
        super(weight);
        this.money = money;
    }

    public Boolean process(FinanceRequest financeRequest) {
        // 处理不了, 返回false, 交下一个处理:
        return financeRequest.getAmount().compareTo(this.money) <= 0;
    }
}
