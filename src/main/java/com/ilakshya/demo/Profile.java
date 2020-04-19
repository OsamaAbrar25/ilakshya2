package com.ilakshya.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int FID;

    private String schoolCode, fyCode, studentCode, installmentName, lastDueDate, feeAmount, lessAmount, receiptAmount, dueAmount, mdate;

    public Profile() {
    }

    public Profile(String SchoolCode, String FYCode, String StudentCode, String InstallmentName, String LastDueDate, String FeeAmount, String LessAmount, String ReceiptAmount, String DueAmount, String MDATE) {
        schoolCode = SchoolCode;
        fyCode = FYCode;
        studentCode = StudentCode;
        installmentName = InstallmentName;
        lastDueDate = LastDueDate;
        feeAmount = FeeAmount;
        lessAmount = LessAmount;
        receiptAmount = ReceiptAmount;
        dueAmount = DueAmount;
        mdate = MDATE;
    }


    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getFyCode() {
        return fyCode;
    }

    public void setFyCode(String fyCode) {
        this.fyCode = fyCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getInstallmentName() {
        return installmentName;
    }

    public void setInstallmentName(String installmentName) {
        this.installmentName = installmentName;
    }

    public String getLastDueDate() {
        return lastDueDate;
    }

    public void setLastDueDate(String lastDueDate) {
        this.lastDueDate = lastDueDate;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getLessAmount() {
        return lessAmount;
    }

    public void setLessAmount(String lessAmount) {
        this.lessAmount = lessAmount;
    }

    public String getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }
}
