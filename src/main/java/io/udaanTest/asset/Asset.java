package io.udaanTest.asset;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="ASSET")
public class Asset {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid",strategy = "uuid2")
	@Column(name="ASSET_ID")
	private String assetId;
	
	@Column(name="ASSET_NAME")
	private String assetName;

	
	
	public String getAssetId() {
		return assetId;
	}



	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}



	public String getAssetName() {
		return assetName;
	}



	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}



	public Asset(String assetId, String assetName) {
		super();
		this.assetId = assetId;
		this.assetName = assetName;
	}



	public Asset() {
		
	}

}
