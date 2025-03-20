package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 百科信息
 *
 * @author 
 * @email
 */
@TableName("baike")
public class BaikeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BaikeEntity() {

	}

	public BaikeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 百科详情
     */
    @TableField(value = "baike_content")

    private String baikeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Baike{" +
            "id=" + id +
            ", baikeName=" + baikeName +
            ", baikePhoto=" + baikePhoto +
            ", baikeTypes=" + baikeTypes +
            ", insertTime=" + insertTime +
            ", baikeContent=" + baikeContent +
            ", createTime=" + createTime +
        "}";
    }
}
