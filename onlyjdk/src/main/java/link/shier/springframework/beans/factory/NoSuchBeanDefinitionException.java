/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package link.shier.springframework.beans.factory;

import link.shier.springframework.beans.BeansException;
import org.springframework.core.ResolvableType;
import org.springframework.lang.Nullable;

/**
 * @program: CodeGuide
 * @description:
 * @author: shier
 * @create: 2022-06-28 15:50
 * @see org.springframework.beans.factory.NoSuchBeanDefinitionException
 **/
public class NoSuchBeanDefinitionException extends BeansException {

	@Nullable
	private final String beanName;

	@Nullable
	private final ResolvableType resolvableType;


	/**
	 * Create a new {@code NoSuchBeanDefinitionException}.
	 * @param name the name of the missing bean
	 */
	public NoSuchBeanDefinitionException(String name) {
		super("No bean named '" + name + "' available");
		this.beanName = name;
		this.resolvableType = null;
	}

	/**
	 * Create a new {@code NoSuchBeanDefinitionException}.
	 * @param name the name of the missing bean
	 * @param message detailed message describing the problem
	 */
	public NoSuchBeanDefinitionException(String name, String message) {
		super("No bean named '" + name + "' available: " + message);
		this.beanName = name;
		this.resolvableType = null;
	}

	/**
	 * Create a new {@code NoSuchBeanDefinitionException}.
	 * @param type required type of the missing bean
	 */
	public NoSuchBeanDefinitionException(Class<?> type) {
		this(ResolvableType.forClass(type));
	}

	/**
	 * Create a new {@code NoSuchBeanDefinitionException}.
	 * @param type required type of the missing bean
	 * @param message detailed message describing the problem
	 */
	public NoSuchBeanDefinitionException(Class<?> type, String message) {
		this(ResolvableType.forClass(type), message);
	}

	/**
	 * Create a new {@code NoSuchBeanDefinitionException}.
	 * @param type full type declaration of the missing bean
	 * @since 4.3.4
	 */
	public NoSuchBeanDefinitionException(ResolvableType type) {
		super("No qualifying bean of type '" + type + "' available");
		this.beanName = null;
		this.resolvableType = type;
	}

	/**
	 * Create a new {@code NoSuchBeanDefinitionException}.
	 * @param type full type declaration of the missing bean
	 * @param message detailed message describing the problem
	 * @since 4.3.4
	 */
	public NoSuchBeanDefinitionException(ResolvableType type, String message) {
		super("No qualifying bean of type '" + type + "' available: " + message);
		this.beanName = null;
		this.resolvableType = type;
	}


	/**
	 * Return the name of the missing bean, if it was a lookup <em>by name</em> that failed.
	 */
	@Nullable
	public String getBeanName() {
		return this.beanName;
	}

	/**
	 * Return the required type of the missing bean, if it was a lookup <em>by type</em>
	 * that failed.
	 */
	@Nullable
	public Class<?> getBeanType() {
		return (this.resolvableType != null ? this.resolvableType.resolve() : null);
	}

	/**
	 * Return the required {@link ResolvableType} of the missing bean, if it was a lookup
	 * <em>by type</em> that failed.
	 * @since 4.3.4
	 */
	@Nullable
	public ResolvableType getResolvableType() {
		return this.resolvableType;
	}

}
