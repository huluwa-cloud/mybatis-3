/*
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

/**
 * bound ==> 边界，范围
 *
 * 这个RowBounds定义就是MyBatis的行数范围
 *
 * offset和limit，这两个变量，就是划出了一个数据区间。我希望自己有感性认知。
 * ===========[               数据              ]=============
 *
 * 数据范围都可以用这两个变量来表示。
 *
 * @author Clinton Begin
 */
public class RowBounds {

  public static final int NO_ROW_OFFSET = 0;
  public static final int NO_ROW_LIMIT = Integer.MAX_VALUE;
  public static final RowBounds DEFAULT = new RowBounds();

  private final int offset;
  private final int limit;

  public RowBounds() {

    // 默认的offset就是0
    this.offset = NO_ROW_OFFSET;

    // 默认的数据集合大小，是Integer的最大值，就是21个亿
    this.limit = NO_ROW_LIMIT;

  }

  public RowBounds(int offset, int limit) {
    this.offset = offset;
    this.limit = limit;
  }

  public int getOffset() {
    return offset;
  }

  public int getLimit() {
    return limit;
  }

}
