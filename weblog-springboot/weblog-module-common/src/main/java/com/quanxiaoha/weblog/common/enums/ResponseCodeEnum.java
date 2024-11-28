package com.quanxiaoha.weblog.common.enums;

import com.quanxiaoha.weblog.common.exception.BaseExceptionInterface;
import lombok.Getter;
import lombok.AllArgsConstructor;
/**
 * @author: Kanade
 * @date: 2024-11-25 17:33
 * @description: 响应异常码
 **/
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {

    // --------------- 通用异常状态码 ----------------
    SYSTEM_ERROR("10000","出错啦，后台小哥正在努力修复中..."),

    PARAM_NOT_VALID("10001", "参数错误"),

    // --------------- 业务异常状态码 ----------------
    PRODUCT_NOT_FOUND("20000","该产品不存在（测试使用）"),
    ;

    //异常码
    private String errorCode;
    //错误信息
    private String errorMessage;
}
