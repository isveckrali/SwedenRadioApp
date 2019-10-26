package com.example.harbourfront.Models;

public class SocialmediaplatformsItem{
	private String platformurl;
	private String platform;

	public void setPlatformurl(String platformurl){
		this.platformurl = platformurl;
	}

	public String getPlatformurl(){
		return platformurl;
	}

	public void setPlatform(String platform){
		this.platform = platform;
	}

	public String getPlatform(){
		return platform;
	}

	@Override
 	public String toString(){
		return 
			"SocialmediaplatformsItem{" + 
			"platformurl = '" + platformurl + '\'' + 
			",platform = '" + platform + '\'' + 
			"}";
		}
}
