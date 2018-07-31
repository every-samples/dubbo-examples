package com.ydonglai.dubbo.sample01.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/7/30
 * 微信: yin80871901
 */
public class ProviderApp {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{"sample01/provider/applicationContext.xml"}
		);
		ctx.start();

		System.in.read();
		ctx.stop();
	}

}
