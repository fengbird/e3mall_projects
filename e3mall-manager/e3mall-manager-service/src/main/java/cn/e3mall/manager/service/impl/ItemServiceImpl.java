package cn.e3mall.manager.service.impl;

import cn.e3mall.domain.TbItem;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tengchao
 * @create 2018-03-03-19:20.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;
    @Override
    public TbItem findItemById(Long itemId) {
        TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }
}
