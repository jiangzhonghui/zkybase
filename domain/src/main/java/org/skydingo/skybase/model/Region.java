/* 
 * Region.java
 * 
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
package org.skydingo.skybase.model;

import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
public class Region extends AbstractEntity<Region> {
	private String name;
	
	/**
	 * @return
	 */
	public String getName() { return name; }
	
	/**
	 * @param name
	 */
	public void setName(String name) { this.name = name; }
	
	/* (non-Javadoc)
	 * @see org.skydingo.skybase.model.Entity#getDisplayName()
	 */
	@Override
	@XmlTransient
	public String getDisplayName() { return name; }
}
