package org.wuxinshui.boosters.concurrent.masterWorker.apply;

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

import org.wuxinshui.boosters.concurrent.masterWorker.Worker;

/**
 * Created by wuxinshui on 2017/3/1.
 */
public class CubePlusWorker extends Worker {
	//子任务具体实现逻辑
	@Override
	public Object handle(Object input) {
		Integer integer=Integer.valueOf(input.toString());
		return integer*integer*integer;
	}
}