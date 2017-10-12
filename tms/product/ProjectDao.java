package cn.tedu.ttms.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.ttms.product.entity.Project;

/**项目模块持久层对象*/
public interface ProjectDao {
	/**获取所有项目信息*/
	List<Project> findObjects();
	
	/**
	 * 
	 * @param startIndex 分页查询时的起始位置
	 * @param pageSize	每页最多显示多少记录
	 * @return			当前页数据
	 */
	List<Project> findPageObjects(@Param("startIndex")int startIndex,@Param("pageSize")int pageSize);
	
	/**返回记录总数*/
	int getRowCount();
	
}
