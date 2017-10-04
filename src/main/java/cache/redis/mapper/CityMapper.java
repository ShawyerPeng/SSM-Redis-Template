package cache.redis.mapper;

import cache.redis.po.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {
    /**
     * 获取城市信息列表
     */
    List<City> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     */
    City findById(@Param("id") Long id);

    Long saveCity(City city);

    Long updateCity(City city);

    Long deleteCity(Long id);
}
