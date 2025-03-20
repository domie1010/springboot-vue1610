package com.entity.view;

import com.entity.BaikeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 百科信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("baike")
public class BaikeView extends BaikeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 百科类型的值
		*/
		private String baikeValue;



	public BaikeView() {

	}

	public BaikeView(BaikeEntity baikeEntity) {
		try {
			BeanUtils.copyProperties(this, baikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 百科类型的值
			*/
			public String getBaikeValue() {
				return baikeValue;
			}
			/**
			* 设置： 百科类型的值
			*/
			public void setBaikeValue(String baikeValue) {
				this.baikeValue = baikeValue;
			}














}
