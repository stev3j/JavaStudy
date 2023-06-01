package kr.hs.dgsw.java.file;

import kr.hs.dgsw.java.inherit.Parent;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class SmartFileReader {
    public byte[] readFile(File file) {
        byte[] result = new byte[(int)file.length()];
        InputStream is = null;

        try {
            is = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int length;
            int offset = 0;

            while (true) {
                length = is.read(buffer);
                if (length > 0) {
                    copy(result, buffer, offset, length);
                    offset += length;
                } else {
                    break;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {}
            }
        }

        return result;
    }

    public void copy(byte[] result, byte[] buffer, int offset, int length) {
        for(int i = 0; i < length; i++) {
            result[i + offset] = buffer[i];
        }

    }
}
