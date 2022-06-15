package link.shier.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-15 10:44
 * @see org.springframework.core.io.Resource
 **/
public interface Resource {

    InputStream getInputStream() throws IOException;

}
