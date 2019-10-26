package com.example.harbourfront.Models;

import java.util.List;

public class RadioListingModel{
	private String copyright;
	private Pagination pagination;
	private List<ProgramsItem> programs;

	public void setCopyright(String copyright){
		this.copyright = copyright;
	}

	public String getCopyright(){
		return copyright;
	}

	public void setPagination(Pagination pagination){
		this.pagination = pagination;
	}

	public Pagination getPagination(){
		return pagination;
	}

	public void setPrograms(List<ProgramsItem> programs){
		this.programs = programs;
	}

	public List<ProgramsItem> getPrograms(){
		return programs;
	}

	@Override
 	public String toString(){
		return 
			"RadioListingModel{" + 
			"copyright = '" + copyright + '\'' + 
			",pagination = '" + pagination + '\'' + 
			",programs = '" + programs + '\'' + 
			"}";
		}
}