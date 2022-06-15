package link.shier.springframework.beans;


import link.shier.springframework.beans.NestedRuntimeException;

/**
 * @program: CodeGuide
 * @description:
 * @author: CHUYAN
 * @create: 2022-06-13 17:13
 * @see org.springframework.beans.BeansException
 **/
public class BeansException extends NestedRuntimeException {

    /**
     * Create a new BeansException with the specified message.
     * @param msg the detail message
     */
    public BeansException(String msg) {
        super(msg);
    }

    /**
     * Create a new BeansException with the specified message
     * and root cause.
     * @param msg the detail message
     * @param cause the root cause
     */
    public BeansException(String msg,Throwable cause) {
        super(msg, cause);
    }
}
