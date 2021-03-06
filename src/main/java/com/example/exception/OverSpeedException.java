package com.example.exception;

/**
 * 速度が上がり過ぎた状態で発生させる検査例外。
 * @author igamasayuki
 *
 */
public class OverSpeedException extends Exception{

	private static final long serialVersionUID = 1L;

	public OverSpeedException() {  
        super();  
    }  
  
    public OverSpeedException(String message) {  
        super(message);  
    }  
  
    public OverSpeedException(String message, Throwable throwable) {  
        super(message, throwable);  
    }  
  
    public OverSpeedException(Throwable throwable) {  
        super(throwable);  
    }  
}
