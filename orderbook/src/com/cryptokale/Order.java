package com.cryptokale;

import java.util.Date;

/**
 * Created by gurol.erdogan on 7.11.2017.
 */
public class Order {
    public String sourceWallet;
    public String targetWallet;
    public String sourceAmount;
    public String targetAmount;
    public String xrate;
    public Date time;


    public String getSourceWallet() {
        return sourceWallet;
    }

    public void setSourceWallet(String sourceWallet) {
        this.sourceWallet = sourceWallet;
    }

    public String getTargetWallet() {
        return targetWallet;
    }

    public void setTargetWallet(String targetWallet) {
        this.targetWallet = targetWallet;
    }

    public String getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(String sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public String getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(String targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getXrate() {
        return xrate;
    }

    public void setXrate(String xrate) {
        this.xrate = xrate;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sourceWallet='" + sourceWallet + '\'' +
                ", targetWallet='" + targetWallet + '\'' +
                ", sourceAmount='" + sourceAmount + '\'' +
                ", targetAmount='" + targetAmount + '\'' +
                ", xrate='" + xrate + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (sourceWallet != null ? !sourceWallet.equals(order.sourceWallet) : order.sourceWallet != null) return false;
        if (targetWallet != null ? !targetWallet.equals(order.targetWallet) : order.targetWallet != null) return false;
        if (sourceAmount != null ? !sourceAmount.equals(order.sourceAmount) : order.sourceAmount != null) return false;
        if (targetAmount != null ? !targetAmount.equals(order.targetAmount) : order.targetAmount != null) return false;
        if (xrate != null ? !xrate.equals(order.xrate) : order.xrate != null) return false;
        return time != null ? time.equals(order.time) : order.time == null;
    }

    @Override
    public int hashCode() {
        int result = sourceWallet != null ? sourceWallet.hashCode() : 0;
        result = 31 * result + (targetWallet != null ? targetWallet.hashCode() : 0);
        result = 31 * result + (sourceAmount != null ? sourceAmount.hashCode() : 0);
        result = 31 * result + (targetAmount != null ? targetAmount.hashCode() : 0);
        result = 31 * result + (xrate != null ? xrate.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
