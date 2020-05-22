package com.nowcoder.community;

import com.nowcoder.community.service.AlphaService;
import com.nowcoder.community.dao.AlpahDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {



	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);

		AlpahDao alpahDao = applicationContext.getBean(AlpahDao.class);
		System.out.println(alpahDao.select());

		alpahDao = applicationContext.getBean("AlphaHibernate", AlpahDao.class);
		System.out.println(alpahDao.select());


	}

	@Test
	public void TestBeanManagement(){
		AlphaService alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);

		alphaService = applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}

	@Test
	public void testBeanConfig(){
		SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);

		System.out.println(simpleDateFormat.format(new Date()));
	}



	@Autowired
	private AlpahDao alpahDao;

	@Autowired
	@Qualifier("AlphaHibernate")
	private AlpahDao alpahDaoH;

	@Autowired
	private AlphaService alphaService;


	@Test
	public void testDI(){
		System.out.println(alpahDao);
		System.out.println(alpahDaoH);
		System.out.println(alphaService);
	}

}
