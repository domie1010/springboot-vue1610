package com.dao;

import com.entity.BaikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BaikeView;

/**
 * 百科信息 Dao 接口
 *
 * @author 
 */
public interface BaikeDao extends BaseMapper<BaikeEntity> {

   List<BaikeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
