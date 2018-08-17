package com.uqpay.sdk.utils;

public enum PayMethodEnum {
  UnionPayQR(PayMethod.UnionPayQR, ScenesEnum.QRCode),
  AlipayQR(PayMethod.AlipayQR, ScenesEnum.QRCode),
  WeChatQR(PayMethod.WeChatQR, ScenesEnum.QRCode),
  WeChatH5(PayMethod.WeChatH5, ScenesEnum.OnlinePay),
  UnionPayOnline(PayMethod.UnionPayOnline, ScenesEnum.OnlinePay),
  VISA(PayMethod.VISA, ScenesEnum.CreditCard),
  VISA3D(PayMethod.VISA3D, ScenesEnum.ThreeDCreditCard),
  Master(PayMethod.Master, ScenesEnum.CreditCard),
  Master3D(PayMethod.Master3D, ScenesEnum.ThreeDCreditCard),
  UnionPay(PayMethod.UnionPay, ScenesEnum.CreditCard),
  AMEX(PayMethod.AMEX, ScenesEnum.CreditCard),
  JCB(PayMethod.JCB, ScenesEnum.CreditCard),
  PayPal(PayMethod.PayPal, ScenesEnum.CreditCard),
  Alipay(PayMethod.Alipay, ScenesEnum.OnlinePay),
  AlipayWap(PayMethod.AlipayWap, ScenesEnum.OnlinePay),
  Wechat_InAPP(PayMethod.Wechat_InAPP, ScenesEnum.InApp),
  UnionPay_InAPP(PayMethod.UnionPay_InAPP, ScenesEnum.InApp),
  ApplePay(PayMethod.ApplePay, ScenesEnum.OnlinePay);

  private int value;
  private ScenesEnum scenes;

  PayMethodEnum(int value, ScenesEnum scenes) {
    this.value = value;
    this.scenes = scenes;
  }

  public static PayMethodEnum valueOf(int value) {
    for (PayMethodEnum val : PayMethodEnum.values()) {
      if (value == val.getValue()) {
        return val;
      }
    }
    return null;
  }

  public int getValue() {
    return value;
  }

  public ScenesEnum getScenes() {
    return scenes;
  }
}
