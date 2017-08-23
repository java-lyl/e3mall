package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TBItemService;

/****************************************
 * @2017年8月23日
 * @author lyl
 * @describe
 * 商品类的逻辑业务层实现类
 ********************/
@Service
@Transactional
public class TBItemServiceImpl implements TBItemService {

	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem selectById(Long itemId) {
		return tbItemMapper.selectByPrimaryKey(itemId);
	}

}
