package com.ydonglai.dubbo.sample01.provider;

import com.ydonglai.dubbo.sample01.provider.PService;
import org.springframework.stereotype.Service;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/7/30
 * 微信: yin80871901
 */
@Service("pService")
public class PServiceImpl implements PService {

	@Override
	public String ping() {
		System.out.println("provider ping() 方法被调用");
		return "123456";
	}

}
