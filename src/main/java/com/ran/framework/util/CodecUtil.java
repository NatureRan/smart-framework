package com.ran.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 编码与解码操作工具类
 * Created By nature on 2018/6/19
 */
public final class CodecUtil {
    private static final Logger logger = LoggerFactory.getLogger(CodecUtil.class);

    /**
     * url编码
     * @param source
     * @return
     */
    public static String encodeUrl(String source) {
        String target;
        try {
            target = URLEncoder.encode(source, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.error("encode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    /**
     * url解码
     * @param source
     * @return
     */
    public static String decodeUrl(String source) {
        String target;
        try {
            target = URLDecoder.decode(source, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.error("decode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }
}
