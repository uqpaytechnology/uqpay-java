package com.uqpay.sdk.dto.common;

import com.uqpay.sdk.dto.ParamLink;
import com.uqpay.sdk.utils.Constants;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class BankCardExtendDTO extends BankCardDTO {
  private static final long serialVersionUID = -6572498004474248352L;

  @ParamLink(Constants.BANK_CARD_ADDRESS_COUNTRY)
  @NotEmpty
  private String addressCountry;
  @ParamLink(Constants.BANK_CARD_EMAIL)
  @Email
  private String email;

  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
