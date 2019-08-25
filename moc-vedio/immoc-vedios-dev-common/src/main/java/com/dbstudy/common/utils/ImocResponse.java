package com.dbstudy.common.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: Joy-D
 * Date: 2019/8/25
 * @Description: （Response）返回值的定义
 */

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ImocResponse {

    //状态码 标明请求是否成功
    private String status;

    //错误码
    private String errorField;

    //错误信息
    private String errorMsg;

    //返回多个结果
    private List<?> entities;

    //返回一个结果
    private Object entity;

    //是否第一页
    private Boolean isFirst;

    //是否最后一页
    private Boolean isLast;

    //一页的记录个数
    private Integer number;

    //当前页的记录个数
    private Integer numberOfElement;

    //总共多少页
    private Integer totalPages;

    //总共多少记录
    private Long totalElements;

}
