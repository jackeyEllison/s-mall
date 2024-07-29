package cn.bugstack.service;

import cn.bugstack.domain.req.ShopCartReq;
import cn.bugstack.domain.res.PayOrderRes;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 订单服务
 * @create 2024-07-30 07:18
 */
public interface IOrderService {

    /**
     * 通过购物车实体对象，创建支付单实体（用于支付）—— 所有的订单下单都从购物车开始触发
     *
     * @param shopCartReq 购物车实体
     * @return 支付单实体
     */
    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

}
