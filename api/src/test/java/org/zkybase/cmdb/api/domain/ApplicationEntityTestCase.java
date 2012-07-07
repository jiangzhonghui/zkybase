/* 
 * Copyright 2011-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zkybase.cmdb.api.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public class ApplicationEntityTestCase {
	private static final Long APPLICATION_ID = 9999L;
	private static final String APPLICATION_NAME = "Zkybase CMDB";
	
	private ApplicationEntity application;
	
	@Before
	public void setUp() throws Exception {
		this.application = new ApplicationEntity();
	}
	
	@Test
	public void idAccessors() {
		assertNull(application.getId());
		application.setId(APPLICATION_ID);
		assertEquals(APPLICATION_ID, application.getId());
	}
	
	@Test
	public void nameAccessors() {
		assertNull(application.getName());
		application.setName(APPLICATION_NAME);
		assertEquals(APPLICATION_NAME, application.getName());
	}
}
