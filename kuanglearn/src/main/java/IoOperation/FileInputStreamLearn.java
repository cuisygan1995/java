package IoOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamLearn {

    public static void readData() throws IOException {
        //读数据
        String path = "/Users/ganchang/Downloads/test.txt";

        FileInputStream tarFile = new FileInputStream(path);
        System.out.println("----------一个个  读取----------");
//        int read = 0; //一个个读
//        while ((read = tarFile.read()) != -1) {
//            System.out.println((char) read);
//        }
        System.out.println("----------批量读取----------");
        byte[] bytes = new byte[6];
        int readBatch;
        while ((readBatch = tarFile.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readBatch));
        }
        tarFile.close();
    }

    public static void writeData() throws IOException {
        String path = "/Users/ganchang/Downloads/test.txt";

        // 写数据
        FileOutputStream desFile = new FileOutputStream(path, true);
        String data = "hello world";
        desFile.write('a'); // 一个字节一个字节写入
        // 字符串写入
        desFile.write(data.getBytes());
        desFile.close();
    }

    public static void copyData() {
        String path = "/Users/ganchang/Downloads/test.txt";
        String path2 = "/Users/ganchang/Downloads/test_copy.txt";

        FileInputStream tarFile = null;
        try {
            tarFile = new FileInputStream(path);
            FileOutputStream desFile = new FileOutputStream(path2);
            int read;
            byte[] bytes = new byte[3];
            while ((read = tarFile.read(bytes)) != -1) {
                desFile.write(bytes, 0, read);
            }
            tarFile.close();
            desFile.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        copyData();
    }
}
