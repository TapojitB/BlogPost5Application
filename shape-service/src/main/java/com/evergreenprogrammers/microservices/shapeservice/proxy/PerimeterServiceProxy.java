/**
 * 
 */
package com.evergreenprogrammers.microservices.shapeservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.evergreenprogrammers.microservices.shapeservice.bo.Perimeter;

/**
 * @author TapojitBhattacharya
 *
 */
@FeignClient(name = "perimeter-service", url="http://localhost:8100")
public interface PerimeterServiceProxy {

	@GetMapping("/perimeter/shapeType/{shapeType}")
	public Perimeter getPerimeter(@PathVariable("shapeType") String shapeType);

}