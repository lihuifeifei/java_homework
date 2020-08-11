import java.io.File;
import java.io.FileInputStream;
public class Readfile {
    public static void readfile() throws Exception {
        /**
         *取出所有的商品信息
         */
        File folder = new File(".//product");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {
                FileInputStream fi = new FileInputStream(listOfFiles[i]);
                byte[] bts = new byte[1024];
                fi.read(bts);
                System.out.println(new String(bts));
            }
        }
    }
}
