package com.paprika.spring.boot.mvc.service;

/**
 * @author adam
 * @date 2019/5/24
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public interface DesensitizationService {

    public String name(String fullName);

    public String idCardNum(String identityNumber);

    public String address(String address, int sensitiveSize);

    public String mobilePhone(String mobilePhoneNumber);

    public String fixedPhone(String fixedTelephoneNumber);

    public String email(String emailAddress);

    public String bankCard(String bankCardNumber);

    public String password(String password);

}
