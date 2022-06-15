package link.shier.springframework.beans.factory.config;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-14 18:01
 * @see org.springframework.beans.factory.config.BeanReference
 **/
public class BeanReference {

    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }
}
