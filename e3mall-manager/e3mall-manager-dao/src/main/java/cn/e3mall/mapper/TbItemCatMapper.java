package cn.e3mall.mapper;

import cn.e3mall.domain.TbItemCat;
import java.util.List;

public interface TbItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    TbItemCat selectByPrimaryKey(Long id);

    List<TbItemCat> selectAll();

    int updateByPrimaryKey(TbItemCat record);
}