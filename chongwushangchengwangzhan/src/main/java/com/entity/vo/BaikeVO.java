package com.entity.vo;

import com.entity.BaikeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 百科信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("baike")
public class BaikeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 百科名称
     */

    @TableField(value = "baike_name")
    private String baikeName;


    /**
     * 百科图片
     */

    @TableField(value = "baike_photo")
    private String baikePhoto;


    /**
     * 百科类型
     */

    @TableField(value = "baike_types")
    private Integer baikeTypes;


    /**
     * 百科发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 百科详情
     */

    @TableField(value = "baike_content")
    private String baikeContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：百科名称
	 */
    public String getBaikeName() {
        return baikeName;
    }


    /**
	 * 获取：百科名称
	 */

    public void setBaikeName(String baikeName) {
        this.baikeName = baikeName;
    }
    /**
	 * 设置：百科图片
	 */
    public String getBaikePhoto() {
        return baikePhoto;
    }


    /**
	 * 获取：百科图片
	 */

    public void setBaikePhoto(String baikePhoto) {
        this.baikePhoto = baikePhoto;
    }
    /**
	 * 设置：百科类型
	 */
    public Integer getBaikeTypes() {
        return baikeTypes;
    }


    /**
	 * 获取：百科类型
	 */

    public void setBaikeTypes(Integer baikeTypes) {
        this.baikeTypes = baikeTypes;
    }
    /**
	 * 设置：百科发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：百科发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：百科详情
	 */
    public String getBaikeContent() {
        return baikeContent;
    }


    /**
	 * 获取：百科详情
	 */

    public void setBaikeContent(String baikeContent) {
        this.baikeContent = baikeContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
