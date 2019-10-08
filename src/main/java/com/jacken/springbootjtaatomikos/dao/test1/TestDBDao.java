package com.jacken.springbootjtaatomikos.dao.test1;

import org.apache.ibatis.annotations.Param;

public interface TestDBDao {

	void saveTest(@Param("name") String name);
}
