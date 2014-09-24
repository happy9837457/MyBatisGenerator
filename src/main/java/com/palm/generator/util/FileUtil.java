package com.palm.generator.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 文件工具类
 * 
 * @author weixiang.qin
 * 
 */
public class FileUtil {
	/**
	 * 生成文件
	 * 
	 * @param path
	 * @param key
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void write(String path, String content) {
		try {
			File file = new File(path);
			File parent = file.getParentFile();
			if(!parent.exists()){
				parent.mkdirs();
			}
			if (file.exists()) {
				file.delete();
			}
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			osw.write(content);
			osw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
