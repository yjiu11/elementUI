package com.ours.ocr;

import java.net.URLEncoder;

/**
 * @author ls
 * @date 2019-07-01 21:12
 * @description
 */
public class ReadImageUtil {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    private static String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/general";

    public static String readImage(String filePath) {
        // 通用识别url
        // 本地图片路径
        //String filePath = "doc/timg.jpeg";
        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            //String accessToken = "#####调用鉴权接口获取的token#####";
            String accessToken = AuthUtil.getCache().get("cache");

            String result = HttpUtil.post(otherHost, accessToken, params);
            if (result.indexOf("error") > -1) {
                Thread.sleep(1000);
                accessToken = AuthUtil.getAuthToken();
                result = HttpUtil.post(otherHost, accessToken, params);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "识别失败";
    }
}