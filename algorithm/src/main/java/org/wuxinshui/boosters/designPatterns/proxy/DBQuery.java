package org.wuxinshui.boosters.designPatterns.proxy;

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
 * Created by wuxinshui on 2017/2/21.
 */
//真实主题
public class DBQuery implements IDBQuery {

	public DBQuery(){
		try {
			Thread.sleep(1000);//模拟数据库连接等耗时操作
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



	@Override
	public String request() {
		return "request String";
	}
}
