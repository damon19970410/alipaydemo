package com.example.alipaydemo.service;

import com.alipay.api.AlipayApiException;
import com.example.alipaydemo.alipay.AlipayBean;

/**
 * 支付服务
 * @author damon
 */
public interface PayService {

    /**
     * 支付宝支付接口
     * @param alipayBean
     * @return
     * @throws AlipayApiException
     */
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
