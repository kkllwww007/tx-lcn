package com.lorne.tx.compensate.service;

import com.lorne.tx.compensate.model.TransactionInvocation;

/**
 * Created by yuliang on 2017/7/11.
 */
public interface CompensateService {

    //补偿事务标示 识别groupId （远程调用时传递的参数）
    String COMPENSATE_KEY = "COMPENSATE";


    void start();

    String saveTransactionInfo(TransactionInvocation invocation, String groupId, String taskId);

    boolean deleteTransactionInfo(String id);

    /**
     * 执行任务确认事务是否正常
     *
     * @param compensateId
     */
    void addTask(String compensateId);


    int countCompensateByTaskId(String taskId);
}
