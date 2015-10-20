package com.springmvc.utils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.cglib.beans.BeanMap.Generator;
/**
 * 
* @ClassName: Generate 
* @Description: 根据xml文件中配置自动生成MyBatis的配置文件和类 
* @author qinghua.wu 
* @date 2015年10月20日 下午1:33:43 
*
 */
public class Generate {
	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		ConfigurationParser cp = new ConfigurationParser(warnings);
		InputStream resourceAsStream = Generator.class.getResourceAsStream("/generator.xml");
		Configuration config = cp.parseConfiguration(resourceAsStream);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
