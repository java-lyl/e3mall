package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/****************************************
 * @2017年8月23日
 * @author lyl
 * @describe
 * 商品的逻辑层接口
 ********************/
public interface TBItemService {

	public TbItem selectById(Long itemId) ;
}
