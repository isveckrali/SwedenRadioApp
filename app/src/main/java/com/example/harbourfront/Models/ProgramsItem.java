package com.example.harbourfront.Models;

import java.util.List;

public class ProgramsItem{
	private String programimagetemplatewide;
	private String programimagewide;
	private String programslug;
	private String socialimage;
	private Channel channel;
	private String description;
	private String programimagetemplate;
	private boolean haspod;
	private String broadcastinfo;
	private boolean archived;
	private String phone;
	private boolean hasondemand;
	private String name;
	private String programurl;
	private String programimage;
	private int id;
	private String socialimagetemplate;
	private List<SocialmediaplatformsItem> socialmediaplatforms;
	private String email;
	private String responsibleeditor;
	private Programcategory programcategory;

	public void setProgramimagetemplatewide(String programimagetemplatewide){
		this.programimagetemplatewide = programimagetemplatewide;
	}

	public String getProgramimagetemplatewide(){
		return programimagetemplatewide;
	}

	public void setProgramimagewide(String programimagewide){
		this.programimagewide = programimagewide;
	}

	public String getProgramimagewide(){
		return programimagewide;
	}

	public void setProgramslug(String programslug){
		this.programslug = programslug;
	}

	public String getProgramslug(){
		return programslug;
	}

	public void setSocialimage(String socialimage){
		this.socialimage = socialimage;
	}

	public String getSocialimage(){
		return socialimage;
	}

	public void setChannel(Channel channel){
		this.channel = channel;
	}

	public Channel getChannel(){
		return channel;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setProgramimagetemplate(String programimagetemplate){
		this.programimagetemplate = programimagetemplate;
	}

	public String getProgramimagetemplate(){
		return programimagetemplate;
	}

	public void setHaspod(boolean haspod){
		this.haspod = haspod;
	}

	public boolean isHaspod(){
		return haspod;
	}

	public void setBroadcastinfo(String broadcastinfo){
		this.broadcastinfo = broadcastinfo;
	}

	public String getBroadcastinfo(){
		return broadcastinfo;
	}

	public void setArchived(boolean archived){
		this.archived = archived;
	}

	public boolean isArchived(){
		return archived;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setHasondemand(boolean hasondemand){
		this.hasondemand = hasondemand;
	}

	public boolean isHasondemand(){
		return hasondemand;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setProgramurl(String programurl){
		this.programurl = programurl;
	}

	public String getProgramurl(){
		return programurl;
	}

	public void setProgramimage(String programimage){
		this.programimage = programimage;
	}

	public String getProgramimage(){
		return programimage;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSocialimagetemplate(String socialimagetemplate){
		this.socialimagetemplate = socialimagetemplate;
	}

	public String getSocialimagetemplate(){
		return socialimagetemplate;
	}

	public void setSocialmediaplatforms(List<SocialmediaplatformsItem> socialmediaplatforms){
		this.socialmediaplatforms = socialmediaplatforms;
	}

	public List<SocialmediaplatformsItem> getSocialmediaplatforms(){
		return socialmediaplatforms;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setResponsibleeditor(String responsibleeditor){
		this.responsibleeditor = responsibleeditor;
	}

	public String getResponsibleeditor(){
		return responsibleeditor;
	}

	public void setProgramcategory(Programcategory programcategory){
		this.programcategory = programcategory;
	}

	public Programcategory getProgramcategory(){
		return programcategory;
	}

	@Override
 	public String toString(){
		return 
			"ProgramsItem{" + 
			"programimagetemplatewide = '" + programimagetemplatewide + '\'' + 
			",programimagewide = '" + programimagewide + '\'' + 
			",programslug = '" + programslug + '\'' + 
			",socialimage = '" + socialimage + '\'' + 
			",channel = '" + channel + '\'' + 
			",description = '" + description + '\'' + 
			",programimagetemplate = '" + programimagetemplate + '\'' + 
			",haspod = '" + haspod + '\'' + 
			",broadcastinfo = '" + broadcastinfo + '\'' + 
			",archived = '" + archived + '\'' + 
			",phone = '" + phone + '\'' + 
			",hasondemand = '" + hasondemand + '\'' + 
			",name = '" + name + '\'' + 
			",programurl = '" + programurl + '\'' + 
			",programimage = '" + programimage + '\'' + 
			",id = '" + id + '\'' + 
			",socialimagetemplate = '" + socialimagetemplate + '\'' + 
			",socialmediaplatforms = '" + socialmediaplatforms + '\'' + 
			",email = '" + email + '\'' + 
			",responsibleeditor = '" + responsibleeditor + '\'' + 
			",programcategory = '" + programcategory + '\'' + 
			"}";
		}
}