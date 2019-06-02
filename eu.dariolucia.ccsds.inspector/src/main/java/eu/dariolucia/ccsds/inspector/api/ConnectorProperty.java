/*
 * Copyright 2018-2019 Dario Lucia (https://www.dariolucia.eu)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package eu.dariolucia.ccsds.inspector.api;

import java.util.Objects;

public final class ConnectorProperty<T> {

	private final ConnectorPropertyDescriptor<T> descriptor;

	private final T value;

	public ConnectorProperty(ConnectorPropertyDescriptor<T> descriptor, T value) {
		this.descriptor = descriptor;
		this.value = value;
	}

	public String getId() {
		return descriptor.getId();
	}

	public String getName() {
		return descriptor.getName();
	}

	public String getDescription() {
		return descriptor.getDescription();
	}

	public String getValueAsString() {
		return Objects.toString(value, "");
	}

	public T getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ConnectorProperty<?> that = (ConnectorProperty<?>) o;
		return descriptor.equals(that.descriptor) &&
				Objects.equals(value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(descriptor, value);
	}


}
