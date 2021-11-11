package org.example.design.behavioral.mediator.perfect;

import lombok.Getter;

/**
 *  数据库父类, 需要中介类
 *
 * Author: GL
 * Date: 2021-11-10
 */
public abstract class AbstractDatabase<T> {
    @Getter
    private final AbstractMediator<T> mediator;    // 中介者
    @Getter
    private final DatabaseCommand<T> databaseCommand;  // 必须包含一个命令

    public AbstractDatabase(AbstractMediator<T> mediator, DatabaseCommand<T> databaseCommand) {
        this.mediator = mediator;
        this.databaseCommand = databaseCommand;
    }

    public abstract void addData(T data);

    public abstract void add(T data);

}
