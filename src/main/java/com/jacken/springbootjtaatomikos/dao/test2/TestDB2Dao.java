package com.jacken.springbootjtaatomikos.dao.test2;

import org.apache.ibatis.annotations.Param;

public interface TestDB2Dao {

	void saveTest(@Param("name") String name);
}
