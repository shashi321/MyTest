package com.sasi123.Backend.dao;

import java.util.List;

import com.sasi123.Backend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);

}
