/*
 * Copyright 2007-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sinosoft.one.mvc.web;

/**
 * 如果控制器action方法的参数对象实现了 {@link BeforeInterceptors}接口，Mvc将拦截所有拦截器之前，调用
 * {@link #doBeforeInterceptors(Invocation)}方法
 * 
 *
 * 
 */
public interface BeforeInterceptors {

    /**
     * 
     * @param inv
     * @throws Exception
     */
    public void doBeforeInterceptors(Invocation inv) throws Exception;

}
