package cn.edu.zucc.exception;

/**
 * Created by 宇强 on 2016/3/15 0015.
 */
public class ForeignKeyException extends Exception {
    public ForeignKeyException(Throwable throwable){
        super(throwable);
    }
}
