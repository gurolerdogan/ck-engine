package com.cryptokale;

import java.util.Date;

/**
 * Created by gurol.erdogan on 7.11.2017.
 */
public class Order {
    private long orderId;
    private String userWallet;
    private Currency walletCurrency;
    private Currency orderCurrency;
    private Double orderPrice;
    private Double orderAmount;
    private String orderType;
    private String xrate;
    private Date time;

    public Order(long orderId, String userWallet, Currency walletCurrency, Currency orderCurrency, Double orderPrice, Double orderAmount, String orderType, String xrate, Date time) {
        this.orderId = orderId;
        this.userWallet = userWallet;
        this.walletCurrency = walletCurrency;
        this.orderCurrency = orderCurrency;
        this.orderPrice = orderPrice;
        this.orderAmount = orderAmount;
        this.orderType = orderType;
        this.xrate = xrate;
        this.time = time;
    }


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(String userWallet) {
        this.userWallet = userWallet;
    }

    public Currency getWalletCurrency() {
        return walletCurrency;
    }

    public void setWalletCurrency(Currency walletCurrency) {
        this.walletCurrency = walletCurrency;
    }

    public Currency getOrderCurrency() {
        return orderCurrency;
    }

    public void setOrderCurrency(Currency orderCurrency) {
        this.orderCurrency = orderCurrency;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
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
}
