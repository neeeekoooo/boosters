package org.wuxinshui.boosters.framework.ServiceProviderFramework;

/**
 * Copyright [2017$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by wuxinshui on 2017/2/7.
 * 客户端类
 */
public class Client {
	public static void main(String[] args) throws ClassNotFoundException {

		//实例化提供者实现类，并注册服务
		Class.forName("org.wuxinshui.boosters.framework.ServiceProviderFramework.EntityProvider");
		ServiceInterface service = ServiceManager.newInstance("ServiceInterfaceImpl");
		service.serve();
	}
}
