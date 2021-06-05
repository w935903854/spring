package com.tuling.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 4/5/21 8:16 PM
 **/
public class MyDeferredImportSelect implements DeferredImportSelector {

	@Override
	public Class<? extends Group> getImportGroup() {
		return MyGroup.class;
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}




	public static class  MyGroup implements Group{
		AnnotationMetadata metadata;

		@Override
		public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
			this.metadata=metadata;
		}

		@Override
		public Iterable<Entry> selectImports() {
			return Arrays.asList(new Entry(metadata,"com.tuling.entity.User"));
		}
	}

}
