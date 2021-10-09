import java.io.*;
import java.util.ArrayList;
import java.math.BigDecimal;

public class IOOperate {

    public static void create_file(String scriptsBaseDirAddress,
                                   String[] old_file_list,
                                   String[] new_file_list)
            throws IOException {
        for (int i = 0; i < old_file_list.length; i++) {
            File old_file = new File(scriptsBaseDirAddress + (String) old_file_list[i]);
            File new_file = new File(scriptsBaseDirAddress + (String) new_file_list[i]);
            if (!old_file.exists()) {
                old_file.createNewFile();
            }
            if (!new_file.exists()) {
                new_file.createNewFile();
            }
        }

    }

    public static void main(String[] args) throws IOException {

        String scriptsBaseDirAddress = "/Users/ganchang/Desktop/大文件/test/";

        String[] oldFileList = {
                "daojia_order_old.csv",
                "accepted_order_daojia_old.csv",
                "arrive_shop_daojia_old.csv",
                "fetched_order_old.csv",
                "finished_order_old.csv",
                "daojia_srcOrderNo_old.csv"
        };
        String[] newFileList = {
                "daojia_order_new.csv",
                "accepted_order_daojia_new.csv",
                "arrive_shop_daojia_new.csv",
                "fetched_order_new.csv",
                "finished_order_new.csv",
                "daojia_srcOrderNo_new.csv"
        };
//        create_file(scriptsBaseDirAddress, old_file_list, new_file_list);

        // 依次删除old文件，并将new文件重命名为old文件
        for (int i = 0; i < oldFileList.length; i++) {
            File oldFile = new File(scriptsBaseDirAddress + oldFileList[i]);
            File newFile = new File(scriptsBaseDirAddress + newFileList[i]);
            if (oldFile.exists()) {
                System.out.println("删除old文件："+ oldFile.getPath());
                System.out.println(String.valueOf(oldFile.delete()));
            }
            if (newFile.exists()) {
                System.out.println("重命名文件：");
                System.out.println(String.valueOf(newFile.renameTo(oldFile)));
            }
        }
    }
};