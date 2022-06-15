package link.shier.springframework.core.io;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-15 11:33
 * @see org.springframework.core.io.ResourceLoader
 **/
public interface ResourceLoader {


    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
