package com.quanxiaoha.weblog.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.json.JsonParseException;

/**
 * @author: 犬小哈
 * @url:www.quanxiaoha.com
 * @date:2023-08-14 16:27
 * @deprecated: JSON工具类
 **/
public class JsonUtil {

    private static final ObjectMapper INSTANCE = new ObjectMapper();

    public static String toJsonString(Object obj) {
        try{
            return INSTANCE.writeValueAsString(obj);
        }catch (JsonParseException | JsonProcessingException e){
            return obj.toString();
        }
    }
}
