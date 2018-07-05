package com.newcitysoft.wx.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.template.Engine;
import com.jfinal.weixin.sdk.api.ApiConfig;
import com.jfinal.weixin.sdk.api.ApiConfigKit;
import com.newcitysoft.wx.controller.WxMsgController;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/7/5 11:34
 */
public class WxConfig extends JFinalConfig {
    // 本地开发模式
    private boolean isLocalDev = false;

    /**
     * 如果生产环境配置文件存在，则优先加载该配置，否则加载开发环境配置文件
     * @param pro 生产环境配置文件
     * @param dev 开发环境配置文件
     */
    public void loadProp(String pro, String dev) {
        try {
            PropKit.use(pro);
        }
        catch (Exception e) {
            PropKit.use(dev);
            isLocalDev = true;
        }
    }

    @Override
    public void configConstant(Constants constants) {
        loadProp("application.properties", "application.properties");
        constants.setDevMode(PropKit.getBoolean("devMode", false));
        // ApiConfigKit 设为开发模式可以在开发阶段输出请求交互的 xml 与 json 数据
        ApiConfigKit.setDevMode(constants.getDevMode());
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("wx", WxMsgController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }

    @Override
    public void afterJFinalStart() {
        ApiConfig ac = new ApiConfig();
        // 配置微信 API 相关参数
        ac.setToken(PropKit.get("token"));
        ac.setAppId(PropKit.get("appId"));
        ac.setAppSecret(PropKit.get("appSecret"));
        /**
         *  是否对消息进行加密，对应于微信平台的消息加解密方式：
         *  1：true进行加密且必须配置 encodingAesKey
         *  2：false采用明文模式，同时也支持混合模式
         */
        ac.setEncryptMessage(PropKit.getBoolean("encryptMessage", false));
        ac.setEncodingAesKey(PropKit.get("encodingAesKey", "setting it in config file"));

        /**
         * 多个公众号时，重复调用ApiConfigKit.putApiConfig(ac)依次添加即可，第一个添加的是默认。
         */
        ApiConfigKit.putApiConfig(ac);
    }
}
