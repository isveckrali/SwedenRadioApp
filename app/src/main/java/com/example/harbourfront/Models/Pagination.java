package com.example.harbourfront.Models;

public class Pagination{
	private String nextpage;
	private int size;
	private int totalhits;
	private int page;
	private int totalpages;

	public void setNextpage(String nextpage){
		this.nextpage = nextpage;
	}

	public String getNextpage(){
		return nextpage;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setTotalhits(int totalhits){
		this.totalhits = totalhits;
	}

	public int getTotalhits(){
		return totalhits;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setTotalpages(int totalpages){
		this.totalpages = totalpages;
	}

	public int getTotalpages(){
		return totalpages;
	}

	@Override
 	public String toString(){
		return 
			"Pagination{" + 
			"nextpage = '" + nextpage + '\'' + 
			",size = '" + size + '\'' + 
			",totalhits = '" + totalhits + '\'' + 
			",page = '" + page + '\'' + 
			",totalpages = '" + totalpages + '\'' + 
			"}";
		}
}
