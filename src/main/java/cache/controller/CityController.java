package cache.controller;

import cache.redis.po.City;
import cache.redis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    @ResponseBody
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/city", method = RequestMethod.POST)
    @ResponseBody
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/city", method = RequestMethod.PUT)
    @ResponseBody
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
// http://www.bysocket.com/?p=1756