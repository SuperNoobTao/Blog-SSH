package cn.edu.zucc.exception;

/**
 * Created by shentao on 2016/6/12.
 */
public class ForeignKeyException extends Exception {
    public ForeignKeyException(Throwable throwable){
        super(throwable);
    }
}
