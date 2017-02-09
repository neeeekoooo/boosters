package org.wuxinshui.boosters.designPatterns.singleton;

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

import java.io.Serializable;

/**
 * Created by wuxinshui on 2017/2/9.
 */
//序列化和反序列化可能会破坏单例
public class SerSingleton implements Serializable {

	//私有构造器阻止被实例化
	private SerSingleton() {
	}

	private static class SingletonHolder {
		private static final SerSingleton instance = new SerSingleton();
	}

	public static SerSingleton getInstance() {
		return SingletonHolder.instance;
	}

	//序列化和反序列化可能会破坏单例
	//readResolve method to preserve singleton property
	//阻止生成新的实例，总是返回当前对象
	private Object readResolve(){
		//Return the true one SerSingleton and let garbage collector
		// take care of the SerSingleton impersonator.
		return SingletonHolder.instance;
	}

}
