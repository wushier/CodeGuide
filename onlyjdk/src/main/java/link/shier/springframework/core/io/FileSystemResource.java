package link.shier.springframework.core.io;

import org.springframework.util.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-15 10:49
 * @see org.springframework.core.io.FileSystemResource
 **/
public class FileSystemResource implements Resource{

    private final File file;

    private final String path;

    public FileSystemResource(String path) {
        this.file = new File(path);
        this.path = path;
    }

    public FileSystemResource(File file, String path) {
        Assert.notNull(path, "Path must not be null");
        this.file = file;
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(file);
    }

    public String getPath() {
        return path;
    }
}
