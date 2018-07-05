package com.newcitysoft.wx.controller;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.weixin.iot.msg.InEquDataMsg;
import com.jfinal.weixin.iot.msg.InEqubindEvent;
import com.jfinal.weixin.sdk.jfinal.MsgController;
import com.jfinal.weixin.sdk.msg.in.InImageMsg;
import com.jfinal.weixin.sdk.msg.in.InLinkMsg;
import com.jfinal.weixin.sdk.msg.in.InLocationMsg;
import com.jfinal.weixin.sdk.msg.in.InNotDefinedMsg;
import com.jfinal.weixin.sdk.msg.in.InShortVideoMsg;
import com.jfinal.weixin.sdk.msg.in.InTextMsg;
import com.jfinal.weixin.sdk.msg.in.InVideoMsg;
import com.jfinal.weixin.sdk.msg.in.InVoiceMsg;
import com.jfinal.weixin.sdk.msg.in.card.InCardPassCheckEvent;
import com.jfinal.weixin.sdk.msg.in.card.InCardPayOrderEvent;
import com.jfinal.weixin.sdk.msg.in.card.InCardSkuRemindEvent;
import com.jfinal.weixin.sdk.msg.in.card.InMerChantOrderEvent;
import com.jfinal.weixin.sdk.msg.in.card.InUpdateMemberCardEvent;
import com.jfinal.weixin.sdk.msg.in.card.InUserCardEvent;
import com.jfinal.weixin.sdk.msg.in.card.InUserConsumeCardEvent;
import com.jfinal.weixin.sdk.msg.in.card.InUserGetCardEvent;
import com.jfinal.weixin.sdk.msg.in.card.InUserGiftingCardEvent;
import com.jfinal.weixin.sdk.msg.in.card.InUserPayFromCardEvent;
import com.jfinal.weixin.sdk.msg.in.event.InCustomEvent;
import com.jfinal.weixin.sdk.msg.in.event.InFollowEvent;
import com.jfinal.weixin.sdk.msg.in.event.InLocationEvent;
import com.jfinal.weixin.sdk.msg.in.event.InMassEvent;
import com.jfinal.weixin.sdk.msg.in.event.InMenuEvent;
import com.jfinal.weixin.sdk.msg.in.event.InNotDefinedEvent;
import com.jfinal.weixin.sdk.msg.in.event.InPoiCheckNotifyEvent;
import com.jfinal.weixin.sdk.msg.in.event.InQrCodeEvent;
import com.jfinal.weixin.sdk.msg.in.event.InShakearoundUserShakeEvent;
import com.jfinal.weixin.sdk.msg.in.event.InTemplateMsgEvent;
import com.jfinal.weixin.sdk.msg.in.event.InVerifyFailEvent;
import com.jfinal.weixin.sdk.msg.in.event.InVerifySuccessEvent;
import com.jfinal.weixin.sdk.msg.in.event.InWifiEvent;
import com.jfinal.weixin.sdk.msg.in.speech_recognition.InSpeechRecognitionResults;
import lombok.extern.slf4j.Slf4j;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/7/5 11:38
 */
@Slf4j
public class WxMsgController extends MsgController {

    @Override
    protected void processInTextMsg(InTextMsg inTextMsg) {
        log.info(JSONObject.toJSONString(inTextMsg));
    }

    @Override
    protected void processInImageMsg(InImageMsg inImageMsg) {

    }

    @Override
    protected void processInVoiceMsg(InVoiceMsg inVoiceMsg) {

    }

    @Override
    protected void processInVideoMsg(InVideoMsg inVideoMsg) {

    }

    @Override
    protected void processInShortVideoMsg(InShortVideoMsg inShortVideoMsg) {

    }

    @Override
    protected void processInLocationMsg(InLocationMsg inLocationMsg) {

    }

    @Override
    protected void processInLinkMsg(InLinkMsg inLinkMsg) {

    }

    @Override
    protected void processInCustomEvent(InCustomEvent inCustomEvent) {

    }

    @Override
    protected void processInFollowEvent(InFollowEvent inFollowEvent) {

    }

    @Override
    protected void processInQrCodeEvent(InQrCodeEvent inQrCodeEvent) {

    }

    @Override
    protected void processInLocationEvent(InLocationEvent inLocationEvent) {

    }

    @Override
    protected void processInMassEvent(InMassEvent inMassEvent) {

    }

    @Override
    protected void processInMenuEvent(InMenuEvent inMenuEvent) {

    }

    @Override
    protected void processInSpeechRecognitionResults(InSpeechRecognitionResults inSpeechRecognitionResults) {

    }

    @Override
    protected void processInTemplateMsgEvent(InTemplateMsgEvent inTemplateMsgEvent) {

    }

    @Override
    protected void processInShakearoundUserShakeEvent(InShakearoundUserShakeEvent inShakearoundUserShakeEvent) {

    }

    @Override
    protected void processInVerifySuccessEvent(InVerifySuccessEvent inVerifySuccessEvent) {

    }

    @Override
    protected void processInVerifyFailEvent(InVerifyFailEvent inVerifyFailEvent) {

    }

    @Override
    protected void processInPoiCheckNotifyEvent(InPoiCheckNotifyEvent inPoiCheckNotifyEvent) {

    }

    @Override
    protected void processInWifiEvent(InWifiEvent inWifiEvent) {

    }

    @Override
    protected void processInUserCardEvent(InUserCardEvent inUserCardEvent) {

    }

    @Override
    protected void processInUpdateMemberCardEvent(InUpdateMemberCardEvent inUpdateMemberCardEvent) {

    }

    @Override
    protected void processInUserPayFromCardEvent(InUserPayFromCardEvent inUserPayFromCardEvent) {

    }

    @Override
    protected void processInMerChantOrderEvent(InMerChantOrderEvent inMerChantOrderEvent) {

    }

    @Override
    protected void processIsNotDefinedEvent(InNotDefinedEvent inNotDefinedEvent) {

    }

    @Override
    protected void processIsNotDefinedMsg(InNotDefinedMsg inNotDefinedMsg) {

    }

    @Override
    protected void processInUserGiftingCardEvent(InUserGiftingCardEvent msg) {

    }

    @Override
    protected void processInUserGetCardEvent(InUserGetCardEvent msg) {

    }

    @Override
    protected void processInUserConsumeCardEvent(InUserConsumeCardEvent msg) {

    }

    @Override
    protected void processInCardSkuRemindEvent(InCardSkuRemindEvent msg) {

    }

    @Override
    protected void processInCardPayOrderEvent(InCardPayOrderEvent msg) {

    }

    @Override
    protected void processInCardPassCheckEvent(InCardPassCheckEvent msg) {

    }

    @Override
    protected void processInEqubindEvent(InEqubindEvent msg) {

    }

    @Override
    protected void processInEquDataMsg(InEquDataMsg msg) {

    }
}
