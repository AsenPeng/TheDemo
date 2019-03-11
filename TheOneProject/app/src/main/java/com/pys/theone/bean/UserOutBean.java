package com.pys.theone.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/12/17 0017.
 */

public class UserOutBean implements Serializable {
    private static final long serialVersionUID = -2718559759470621626L;
    private String ID;
    private String Name;
    private String RealName;
    private String Remark;
    private String Declaration;
    private String Sex;
    private String Email;
    private String IDCardNO;
    private String HeadImage;
    private String Remark1;
    private String Telephone;
    private String PhoneNumber;
    private String PoliticalStatus;
    private String Token;
    private String AddTime;
    private String Company;
    private String Post1;
    private String CompanyAddress;
    private String TeamID;
    private int RealNameState;//0：未提交；1：待审核；2：已认证；3：未通过；
    private String TeamName;
    private String LeadName;

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public String getLeadName() {
        return LeadName;
    }

    public void setLeadName(String leadName) {
        LeadName = leadName;
    }

    public String getTeamID() {
        return TeamID;
    }

    public void setTeamID(String teamID) {
        TeamID = teamID;
    }

    public int getRealNameState() {
        return RealNameState;
    }

    public void setRealNameState(int realNameState) {
        RealNameState = realNameState;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getDeclaration() {
        return Declaration;
    }

    public void setDeclaration(String declaration) {
        Declaration = declaration;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getIDCardNO() {
        return IDCardNO;
    }

    public void setIDCardNO(String IDCardNO) {
        this.IDCardNO = IDCardNO;
    }

    public String getHeadImage() {
        return HeadImage;
    }

    public void setHeadImage(String headImage) {
        HeadImage = headImage;
    }

    public String getRemark1() {
        return Remark1;
    }

    public void setRemark1(String remark1) {
        Remark1 = remark1;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPoliticalStatus() {
        return PoliticalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        PoliticalStatus = politicalStatus;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getAddTime() {
        return AddTime;
    }

    public void setAddTime(String addTime) {
        AddTime = addTime;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getPost1() {
        return Post1;
    }

    public void setPost1(String post1) {
        Post1 = post1;
    }

    public String getCompanyAddress() {
        return CompanyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        CompanyAddress = companyAddress;
    }
}
