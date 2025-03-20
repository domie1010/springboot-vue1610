package com.entity.model;

import com.entity.BaikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 百科信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BaikeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 百科名称
     */
    private String baikeName;


    /**
     * 百科图片
     */
    private String baikePhoto;


    /**
     * 百科类型
     */
    private Integer baikeTypes;


    /**
     * 百科发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 百科详情
     */
    private String baikeContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：百科名称
	 */
    public String getBaikeName() {
        return baikeName;
    }


    /**
	 * 设置：百科名称
	 */
    public void setBaikeName(String baikeName) {
        this.baikeName = baikeName;
    }
    /**
	 * 获取：百科图片
	 */
    public String getBaikePhoto() {
        return baikePhoto;
    }


    /**
	 * 设置：百科图片
	 */
    public void setBaikePhoto(String baikePhoto) {
        this.baikePhoto = baikePhoto;
    }
    /**
	 * 获取：百科类型
	 */
    public Integer getBaikeTypes() {
        return baikeTypes;
    }


    /**
	 * 设置：百科类型
	 */
    public void setBaikeTypes(Integer baikeTypes) {
        this.baikeTypes = baikeTypes;
    }
    /**
	 * 获取：百科发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：百科发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：百科详情
	 */
    public String getBaikeContent() {
        return baikeContent;
    }


    /**
	 * 设置：百科详情
	 */
    public void setBaikeContent(String baikeContent) {
        this.baikeContent = baikeContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
