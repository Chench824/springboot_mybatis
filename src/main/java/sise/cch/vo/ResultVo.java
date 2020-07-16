package sise.cch.vo;

import lombok.Data;

@Data
public class ResultVo<T> {
    private Boolean success;

    private Integer code;

    private String message;

    private T data;
}
