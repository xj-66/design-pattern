package com.design_pattern.template;

import org.junit.Test;

public class TemplateTest {

	@Test
	public void test() {
		AbstractTemplate template = new Template();
		template.execute();
	}

}
