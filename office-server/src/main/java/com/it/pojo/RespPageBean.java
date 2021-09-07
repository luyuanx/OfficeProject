package com.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页返回响应类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    private Long total;
    private List<?> data;
}
