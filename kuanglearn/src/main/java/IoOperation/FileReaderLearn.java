package IoOperation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderLearn {
    public static void readData() throws IOException {
        String file = "/Users/ganchang/Downloads/test的副本.txt";
        FileReader fileReader = new FileReader(file);


//        //一个字符一个字符的读
//        int read;
//        System.out.println("一个字符一个字符的读");
//        while ((read = fileReader.read()) != -1) {
//            System.out.println((char) read);
//        }

        //3个3个的读
        int readLenth;
        System.out.println("3个3个的读");
        char[] chars = new char[3];
        while ((readLenth = fileReader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, readLenth));
        }
        fileReader.close();
    }

    public static void writeData() throws IOException {
        String data = "hello world 我是一个中国人嘿哈";
        String path = "/Users/ganchang/Downloads/writer.txt";

        FileWriter fileWriter = new FileWriter(path);

        //直接写入
        fileWriter.write(data);
        fileWriter.close();
    }

    public static void copyData() throws IOException {
        String file = "/Users/ganchang/Downloads/20210923144806.jmx";
        String desFile = "/Users/ganchang/Downloads/20210923144806_副本.jmx";
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(desFile);
        int readLength;
        char[] chars = new char[10];
        while ((readLength = fileReader.read(chars)) != -1) {
            fileWriter.write(chars, 0, readLength);
        }
        fileReader.close();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        copyData();
    }
}
