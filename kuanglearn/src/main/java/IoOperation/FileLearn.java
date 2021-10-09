package IoOperation;

import java.io.File;
import java.io.IOException;

public class FileLearn {
    public static void main(String[] args) throws IOException {
        String path = "/Users/ganchang/Downloads/test.txt";
        File file = new File(path);
        // 新增文件
        if (file.exists()) {
            System.out.println("data exists!");
        } else {
            file.createNewFile();
        }

        //删除文件
        file.delete();

    }
}
