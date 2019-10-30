package com.ours.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ls
 * @date 2019-06-04 15:43
 * @description
 */
public class FileUtil {

    public static void uploadFile(byte[] file, String filePath, String fileName) throws IOException {

        File targetDir = new File(filePath);
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }
        File targetFile = new File(filePath + File.separator + fileName);
        if (targetFile.exists()) {
            targetFile.delete();
        }
        try(FileOutputStream out = new FileOutputStream(filePath+File.separator+fileName)){
            out.write(file);
            out.flush();
        }
    }

    public static void deleteFile(String filePath, String fileName) throws IOException {

        File targetFile = new File(filePath + File.separator + fileName);
        if (targetFile.exists()) {
            targetFile.delete();
        }

    }
}
