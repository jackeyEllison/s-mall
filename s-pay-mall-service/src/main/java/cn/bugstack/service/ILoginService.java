package cn.bugstack.service;

import java.io.IOException;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 微信服务
 * @create 2024-08-01 08:26
 */
public interface ILoginService {

    String createQrCodeTicket() throws IOException;

    String checkLogin(String ticket);

    void saveLoginState(String ticket, String openid) throws IOException;

}
