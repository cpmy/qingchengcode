package com.qingcheng.service.goods;

import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

public interface BrandService {

    /**
     * 查询所有数据
     * @return
     */
    public List<Brand> findAll();

    /**
     * 分页查询
     * @param page 当前页数
     * @param size 每页条数
     * @return
     */
    public PageResult<Brand> findPage(int page, int size);

    /**
     * 根据条件查询
     * @param searchMap
     * @return
     */
    public List<Brand> findList(Map<String, Object> searchMap);

    /**
     * 根据条件分页查询
     * @param searchMap
     * @param page
     * @param size
     * @return
     */
    public PageResult<Brand> findPage(Map<String,Object> searchMap,int page, int size);

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    public Brand findById(Integer id);

    public void add(Brand brand);

    public void update(Brand brand);

    public void delete(Integer id);
}
