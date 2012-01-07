/* 
 * DataCenter.java
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

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Willie Wheeler (willie.wheeler@gmail.com)
 */
@XmlRootElement
@XmlType(propOrder = { "name" })
public class DataCenter extends AbstractEntity<DataCenter> {
	private static final Logger log = LoggerFactory.getLogger(DataCenter.class);
	
	private String name;
	
	/**
	 * @return
	 */
	@NotNull
	@Size(max = 80)
	@XmlElement
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		log.debug("Comparing DataCenters for equality");
		
		if (!(o instanceof DataCenter)) { return false; }
		
		DataCenter that = (DataCenter) o;
		Long thisId = this.getId();
		Long thatId = that.getId();
		
		if (thisId == null || thatId == null) {
			throw new IllegalStateException("Both DataCenters require an ID");
		}
		
		return thisId.equals(thatId);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		Long id = getId();
		if (id == null) {
			throw new IllegalStateException("ID required");
		}
		return id.hashCode();
	}
	
	@XmlRootElement(name = "dataCenters")
	public static class DataCenterListWrapper implements ListWrapper<DataCenter> {
		private List<DataCenter> list;
		
		/* (non-Javadoc)
		 * @see org.skydingo.skybase.model.ListWrapper#getList()
		 */
		@Override
		@XmlElement(name = "dataCenter")
		public List<DataCenter> getList() { return list; }
		
		/* (non-Javadoc)
		 * @see org.skydingo.skybase.model.ListWrapper#setList(java.util.List)
		 */
		@Override
		public void setList(List<DataCenter> list) { this.list = list; }
	}
}
