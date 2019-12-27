package com.csdj.acct.mapper;

import com.csdj.acct.entity.Acct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName AcctMapper
 * @Description
 * @Author 周佳良
 * @Date 2019/12/24 13:48
 * @Version 1.0
 **/
@Mapper
public interface AcctMapper {
    List<Acct> findAcct(@Param(value = "currPage") int currPage,
                        @Param(value = "pageSize") int pageSize);

    int findAcctCount();

    int addAcct(Acct acct);

    int delAcct(@Param(value = "acctId") int acctId);

    Acct findAcctIdById(@Param(value = "acctId") int acctId);

    int updateAcct(Acct acct);
}
