package com.csdj.acct.service;

import com.csdj.acct.entity.Acct;

import java.util.List;

/**
 * @ClassName AcctService
 * @Description
 * @Author 周佳良
 * @Date 2019/12/24 13:59
 * @Version 1.0
 **/
public interface AcctService {
    List<Acct> findAcct(int currPage,int pageSize);

    int findAcctCount();

    int addAcct(Acct acct);

    int delAcct(int acctId);

    Acct findAcctIdById(int acctId);

    int updateAcct(Acct acct);
}
