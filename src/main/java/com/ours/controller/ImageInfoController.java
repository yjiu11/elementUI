package com.ours.controller;


import com.ours.base.common.Const;
import com.ours.base.common.ServiceMessage;
import com.ours.ocr.ReadImageUtil;
import com.ours.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liushuai
 * @since 2019-06-04
 */
@RestController
@RequestMapping("/image")
public class ImageInfoController {
    @Autowired
    private static final String filePath = "image";

    @PostMapping("upload")
    public ServiceMessage upload(@RequestParam("file") MultipartFile file) {
        ServiceMessage result = new ServiceMessage();
        String fileName = UUID.randomUUID().toString();
        try {
            fileName = fileName + Const.FILE_SPILT + file.getOriginalFilename();

            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            result.buildFail();
            return result;
        }
        result.put(Const.DATA_KEY, fileName);
        result.put("succ", true);
        return result;
    }

    @PostMapping("readImage")
    public ServiceMessage readImage(@RequestBody Map<String, String> params) {
        ServiceMessage result = new ServiceMessage();
        String message = ReadImageUtil.readImage(filePath + File.separator + params.get("path"));
        result.put(Const.DATA_KEY, message);
        return result;
    }

}

