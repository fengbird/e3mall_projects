package cn.e3mall.manager.service;

import cn.e3mall.domain.TbItem;

/**
 * @author tengchao
 * @create 2018-03-03-19:19.
 */
public interface ItemService {
    TbItem findItemById(Long itemId);
}
