package tw.mymis;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileOperationDemo {

    public void FilePathTest() {
        String stringPath="c:/temp/a.txt"; // 在 java 使用 unix/linux 風格的路徑字元 /
        String stringPath2="c:\\temp\\b.txt";
        Path path1 = Paths.get(stringPath);
        Path path2 = Paths.get(stringPath2);

        try {
            if( Files.exists( path1)) {
                //檔案存在 才進行複製
                System.out.println("檔案存在");
                Files.copy(path1, path2);
                System.out.println("複製完成");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void FileReadText() {
        Path file1 = Paths.get("c:/temp/a.txt");

        try {
            //此種模式不適合 處理大型檔案
             List<String> allContent = Files.readAllLines(file1);
             for( String line : allContent) {
                 System.out.println("加工處理這一行: " + line);
             }
//            String fileString = Files.readString(file1);
//            System.out.println("-------- 檔案內容如下-------------");
//            System.out.println(fileString);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void FileReadTextByStream() {
        Path file1 = Paths.get("c:/temp/a.txt");


        try {
            //此種模式適合 處理大型檔案
            BufferedReader br = Files.newBufferedReader(file1);
            String line = null;
            while( (line = br.readLine()) != null ) {
                System.out.println("br讀取: " + line);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void FileReadImage() {
        Path file1 = Paths.get("c:/temp/pict.png");

        try {
            byte[] image =  Files.readAllBytes(file1);
            //進行圖片處理 壓縮 柔化 辨識...

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
