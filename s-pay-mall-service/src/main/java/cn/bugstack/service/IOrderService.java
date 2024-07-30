package cn.bugstack.service;

import cn.bugstack.domain.req.ShopCartReq;
import cn.bugstack.domain.res.PayOrderRes;

import java.util.List;

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


    /**
     * 更新订单状态
     * @param orderId 订单ID
     */
    void changeOrderPaySuccess(String orderId);

    /**
     * 查询有效期内，未接收到支付回调的订单
     */
    List<String> queryNoPayNotifyOrder();

    /**
     * 查询超时15分钟，未支付订单
     */
    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);

}
