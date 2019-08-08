package io.udaanTest.asset;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService {

	@Autowired
	private AssetRepository assetrepository;
	
	public String addAsset(GetAsset getasset) {
		
		if(null == getasset.getAssetName())
			return "Asset Name is invalid";
		
		Asset asset = new Asset();
		asset.setAssetName(getasset.getAssetName());
		assetrepository.save(asset);
		return "Asset added successfully";
		
	}

	public List<Asset> getAllAsset() {
		return assetrepository.findAll();
	}

}
