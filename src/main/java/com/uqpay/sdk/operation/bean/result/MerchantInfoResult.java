package com.uqpay.sdk.operation.bean.result;

public class MerchantInfoResult extends BaseAppgateResult {
  private static final long serialVersionUID = -8749049616307995551L;
  private MerchantInfo merchantInfo;

  public MerchantInfo getMerchantInfo() {
    return merchantInfo;
  }

  public void setMerchantInfo(MerchantInfo merchantInfo) {
    this.merchantInfo = merchantInfo;
  }
}
