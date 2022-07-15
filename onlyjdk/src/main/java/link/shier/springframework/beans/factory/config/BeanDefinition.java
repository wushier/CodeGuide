package link.shier.springframework.beans.factory.config;

import link.shier.springframework.beans.PropertyValues;

/**
 * @program: CodeGuide
 * @description: &#x624B;&#x5199;spring
 * @author: CHUYAN
 * @create: 2022-06-13 10:48
 * @see org.springframework.beans.factory.config.BeanDefinition
 **/
public class BeanDefinition {

    String SCOPE_SINGLETON  = ConfigurableBeanFactory.SCOPE_SINGLETON;

    String SCOPE_PROTOTYPE  = ConfigurableBeanFactory.SCOPE_PROTOTYPE;

    String SCOPE_DEFAULT    = "";

    private String scope = SCOPE_SINGLETON;

    private boolean singleton = true;

    private boolean prototype = false;

    private Class beanClazz;

    private PropertyValues propertyValues;

    private String initMethodName;

    private String destroyMethodName;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean isSingleton() {
        return SCOPE_SINGLETON.equalsIgnoreCase(this.scope) || SCOPE_DEFAULT.equalsIgnoreCase(this.scope);
    }

    public void setSingleton(boolean singleton) {
        this.singleton = singleton;
    }

    public boolean isPrototype() {
        return SCOPE_PROTOTYPE.equalsIgnoreCase(this.scope);
    }

    public void setPrototype(boolean prototype) {
        this.prototype = prototype;
    }

    public BeanDefinition(Class beanClazz) {
        this.beanClazz = beanClazz;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClazz, PropertyValues propertyValues) {
        this.beanClazz = beanClazz;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClazz() {
        return beanClazz;
    }

    public void setBeanClazz(Class beanClazz) {
        this.beanClazz = beanClazz;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }
}
