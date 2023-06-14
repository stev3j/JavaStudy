package kr.hs.dgsw.java.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MyFileCopier {

    public void copy(File src, File dest) {
        OutputStream os = null;

        try {
//            os = new FileOutputStream(file);
//            byte[] bytes = content.getBytes(); // toByte

//            os.write(bytes);
            os.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {}
            }
        }
    }
}
