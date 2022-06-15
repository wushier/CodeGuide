package link.shier.springframework.test;

import cn.hutool.core.io.IoUtil;
import link.shier.springframework.core.io.DefaultResourceLoader;
import link.shier.springframework.core.io.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-15 16:17
 **/
public class LoaderTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_url() throws IOException {
        // 网络原因可能导致GitHub不能读取，可以放到自己的Gitee仓库。读取后可以从内容中搜索关键字；OLpj9823dZ
        Resource resource = resourceLoader.getResource("https://github.com/wushier/CodeGuide/blob/master/onlyjdk/src/main/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
}
