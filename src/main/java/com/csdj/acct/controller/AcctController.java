package com.csdj.acct.controller;

import com.alibaba.fastjson.JSON;
import com.csdj.acct.entity.Acct;
import com.csdj.acct.service.AcctService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AcctController
 * @Description
 * @Author 周佳良
 * @Date 2019/12/24 13:48
 * @Version 1.0
 **/
@Controller
public class AcctController {

    @Resource
    private AcctService service;

    @RequestMapping(value = "show")
    public String show(){
        return "show";
    }

    @RequestMapping(value = "add")
    public String add(){
        return "add";
    }
    @RequestMapping(value = "findAcct", produces = "text/json;charset=utf-8")
    @ResponseBody
    public Object findAcct(@RequestParam(value = "page",required = false) Integer currPage,
                           @RequestParam(value = "limit",required = false) Integer pageSize){
        if (currPage == null) {//如果当前页为空，则默认为第1页
            currPage = 1;
        }
        if (pageSize == null) {//如果每页条数为空，则默认为每页10条
            pageSize = 10;
        }
        int limitOne = (currPage - 1) * pageSize;//计算出从哪一条开始显示
        //记录集合
        List<Acct> list = service.findAcct(limitOne,pageSize);
        //总条数
        int count = service.findAcctCount();
        System.err.println("记录数：" + count);
        String strJson = JSON.toJSONString(list);
        //layui json 格式
        String json = "{\"code\":0,\"msg\":\"\",\"count\":" + count + ",\"data\":" + strJson + "}";
        System.err.println(json);
        return json;
    }

    @RequestMapping(value = "addAcct")
    @ResponseBody
    public Object addAcct(Acct acct){
        int i = service.addAcct(acct);
        return JSON.toJSONString(i);
    }

    @RequestMapping(value = "delAcct")
    @ResponseBody
    public Object delAcct(@RequestParam(value = "acctId") int acctId){
        int i = service.delAcct(acctId);
        return JSON.toJSONString(i);
    }

    @RequestMapping(value = "findAcctIdById", produces = "text/json;charset=utf-8")
    @ResponseBody
    public Object findAcctIdById(@RequestParam(value = "acctId") int acctId){
        Acct acct = service.findAcctIdById(acctId);
        return JSON.toJSONString(acct);
    }

    @RequestMapping(value = "updateAcct")
    @ResponseBody
    public Object updateAcct(Acct acct){
        int i = service.updateAcct(acct);
        return JSON.toJSONString(i);
    }
}
