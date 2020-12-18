package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message) {
        this(code, message, null);
    }

    // public CommonResult(int code, String message , T data){
    //     this.code = code;
    //     this.message = message;
    //     this.data = data;
    // }
}
