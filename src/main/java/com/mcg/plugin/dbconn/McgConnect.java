/*
 * @Copyright (c) 2018 缪聪(mcg-helper@qq.com)
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

package com.mcg.plugin.dbconn;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.mcg.entity.common.Table;
import com.mcg.entity.flow.data.DataRecord;


public interface McgConnect {
    
    boolean testConnect();
    
    List<DataRecord> getTableInfo(String tableName) throws Exception;
    
    List<Table> getTablesByDataSource(String dbName) throws SQLException;

    List<Map<String, Object>> querySql(String sql, Object... para) throws SQLException;
    
    int executeUpdate(String sql, Object... para) throws SQLException;
}
