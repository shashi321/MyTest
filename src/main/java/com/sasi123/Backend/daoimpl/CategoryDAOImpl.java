package com.sasi123.Backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Repository;

import com.sasi123.Backend.dao.CategoryDAO;
import com.sasi123.Backend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
private static List<Category> categories=new ArrayList<>();
	
static{
Category category=new Category();
//adding first category
category.setId(1);
category.setName("Television");
category.setDescription("this is description for television");
category.setImageURL("CAT_1.png");

categories.add(category);
//second category
category=new Category();

category.setId(2);
category.setName("Mobile");
category.setDescription("this is description for mobile");
category.setImageURL("CAT_2.png");
categories.add(category);
//Third category
category=new Category();

category.setId(3);
category.setName("Laptop");
category.setDescription("this is description for laptop");
category.setImageURL("CAT_3.png");
categories.add(category);




}
public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
@Override
public Category get(int id) {
	// TODO Auto-generated method stub
	for(Category category: categories){
		if(category.getId()==id)
			return category;
	}
return null;


}

}
