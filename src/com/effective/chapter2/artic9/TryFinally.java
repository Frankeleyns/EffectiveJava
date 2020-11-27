package com.effective.chapter2.artic9;

import java.io.*;

public class TryFinally {

    /**
     * 读取任意文件第一行
     * @param path 文件路径
     * @return  文件内容
     * @throws IOException 抛出异常
     */
    public static String  firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    /**
     * 拷贝文件
     * @param src   源文件路径
     * @param dst   目标文件路径
     * @throws IOException  抛出异常
     */
    public static void copy(String src,String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try{
            OutputStream out = new FileOutputStream(dst);
            try{
                byte[] buf = new byte[5];
                int n;
                while((n = in.read(buf)) >= 0 )
                    out.write(buf,0,n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

}
