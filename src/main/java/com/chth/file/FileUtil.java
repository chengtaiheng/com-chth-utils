package com.chth.file;

import lombok.val;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * @author: 程泰恒
 */

public class FileUtil {



    /**
     * 以行的方式读取文件,并输出到一个新建的文件中去
     * @param path 源文件path
     * @param newFilePath 新文件path
     * @throws IOException 抛出io异常
     */
    public static void readFileByLine(String path,String newFilePath) throws IOException {

        //通过一个已经存在的文件打开文件字节输入流
        val inputStream = FileUtils.openInputStream(new File(path));

        //获取行迭代器
        val iterator = IOUtils.lineIterator(inputStream, StandardCharsets.UTF_8);


        //新建一个文件，打开文件字节输出流
        val outputStream = FileUtils.openOutputStream(new File(newFilePath));

        val wirter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);

        String content = "";

        while (iterator.hasNext()) {
            String lineContent = iterator.nextLine();
            wirter.append(lineContent+"\r\n");
        }

        wirter.flush();
        wirter.close();
    }
}
