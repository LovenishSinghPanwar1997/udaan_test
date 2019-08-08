package io.udaanTest.asset;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/housekeeping/assets")
public class AssetController {
	
	@Autowired
	AssetService assetservice = new AssetService();
	
	@RequestMapping(method=RequestMethod.POST , value="/add-asset")
	public String addAsset(@RequestBody GetAsset getasset) {
		
		return assetservice.addAsset(getasset);
		
	}
	
	@RequestMapping(method=RequestMethod.GET , value = "/all")
	public List<Asset> getAllAsset(){
		return assetservice.getAllAsset();
	}

}
