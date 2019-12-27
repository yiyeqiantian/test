package com.csdj.acct.entity;

/**
 * @ClassName Acct
 * @Description
 * @Author 周佳良
 * @Date 2019/12/24 13:48
 * @Version 1.0
 **/
public class Acct {
    private int acctId;
    private String consNo;
    private double prepayBal;
    private double freezeAmt;
    private double chgBal;
    private double transitNot;
    private String orgNo;

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public String getConsNo() {
        return consNo;
    }

    public void setConsNo(String consNo) {
        this.consNo = consNo;
    }

    public double getPrepayBal() {
        return prepayBal;
    }

    public void setPrepayBal(double prepayBal) {
        this.prepayBal = prepayBal;
    }

    public double getFreezeAmt() {
        return freezeAmt;
    }

    public void setFreezeAmt(double freezeAmt) {
        this.freezeAmt = freezeAmt;
    }

    public double getChgBal() {
        return chgBal;
    }

    public void setChgBal(double chgBal) {
        this.chgBal = chgBal;
    }

    public double getTransitNot() {
        return transitNot;
    }

    public void setTransitNot(double transitNot) {
        this.transitNot = transitNot;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }
}
