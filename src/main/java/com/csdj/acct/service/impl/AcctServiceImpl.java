package com.csdj.acct.service.impl;

import com.csdj.acct.entity.Acct;
import com.csdj.acct.mapper.AcctMapper;
import com.csdj.acct.service.AcctService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AcctServiceImpl
 * @Description
 * @Author 周佳良
 * @Date 2019/12/24 13:48
 * @Version 1.0
 **/
@Service
public class AcctServiceImpl implements AcctService {

    @Resource
    private AcctMapper mapper;
    @Override
    public List<Acct> findAcct(int currPage, int pageSize) {
        return mapper.findAcct(currPage,pageSize);
    }

    @Override
    public int findAcctCount() {
        return mapper.findAcctCount();
    }

    @Override
    public int addAcct(Acct acct) {
        return mapper.addAcct(acct);
    }

    @Override
    public int delAcct(int acctId) {
        return mapper.delAcct(acctId);
    }

    @Override
    public Acct findAcctIdById(int acctId) {
        return mapper.findAcctIdById(acctId);
    }

    @Override
    public int updateAcct(Acct acct) {
        return mapper.updateAcct(acct);
    }
}
