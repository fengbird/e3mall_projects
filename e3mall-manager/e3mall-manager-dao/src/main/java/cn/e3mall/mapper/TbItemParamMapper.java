package cn.e3mall.mapper;

import cn.e3mall.domain.TbItemParam;
import java.util.List;

public interface TbItemParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemParam record);

    TbItemParam selectByPrimaryKey(Long id);

    List<TbItemParam> selectAll();

    int updateByPrimaryKey(TbItemParam record);
}