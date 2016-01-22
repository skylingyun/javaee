package com.software.usermanager.util;

import java.sql.ResultSet;

public interface ObjectMapper {

	public Object mapping(ResultSet rs);
}
