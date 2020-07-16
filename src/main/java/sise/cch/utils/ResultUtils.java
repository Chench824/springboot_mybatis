package sise.cch.utils;

import sise.cch.vo.ResultVo;

public class ResultUtils {

    public static ResultVo seccess(Object data){
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(true);
        resultVo.setCode(200);
        resultVo.setMessage("成功");
        resultVo.setData(data);
        return resultVo;
    }

    public static ResultVo error(){
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(false);
        resultVo.setCode(400);
        resultVo.setMessage("失败");
        resultVo.setData(null);
        return resultVo;
    }
}
