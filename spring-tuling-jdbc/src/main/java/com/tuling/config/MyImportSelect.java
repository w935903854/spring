package com.tuling.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 4/5/21 8:52 PM
 **/
public class MyImportSelect implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.tuling.entity.User1"};
	}
}
