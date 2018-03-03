package cn.e3mall.mapper;

import cn.e3mall.domain.TbItemParamItem;
import java.util.List;

public interface TbItemParamItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamItem record);

    TbItemParamItem selectByPrimaryKey(Long id);

    List<TbItemParamItem> selectAll();

    int updateByPrimaryKey(TbItemParamItem record);
}