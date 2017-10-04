package cache.redis.service;

import cache.redis.po.City;

public interface CityService {
    /**
     * 根据城市 ID, 查询城市信息
     */
    City findCityById(Long id);

    /**
     * 新增城市信息
     */
    Long saveCity(City city);

    /**
     * 更新城市信息
     */
    Long updateCity(City city);

    /**
     * 根据城市 ID, 删除城市信息
     */
    Long deleteCity(Long id);
}
