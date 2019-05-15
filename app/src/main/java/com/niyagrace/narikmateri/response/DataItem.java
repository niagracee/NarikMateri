package com.niyagrace.narikmateri.response;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("pertemuan")
	private String pertemuan;

	@SerializedName("isiMateri")
	private String isiMateri;

	@SerializedName("judulMateri")
	private String judulMateri;

	@SerializedName("id")
	private String id;

	@SerializedName("gambar")
	private String gambar;

	public void setPertemuan(String pertemuan){
		this.pertemuan = pertemuan;
	}

	public String getPertemuan(){
		return pertemuan;
	}

	public void setIsiMateri(String isiMateri){
		this.isiMateri = isiMateri;
	}

	public String getIsiMateri(){
		return isiMateri;
	}

	public void setJudulMateri(String judulMateri){
		this.judulMateri = judulMateri;
	}

	public String getJudulMateri(){
		return judulMateri;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setGambar(String gambar){
		this.gambar = gambar;
	}

	public String getGambar(){
		return gambar;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"pertemuan = '" + pertemuan + '\'' + 
			",isiMateri = '" + isiMateri + '\'' + 
			",judulMateri = '" + judulMateri + '\'' + 
			",id = '" + id + '\'' + 
			",gambar = '" + gambar + '\'' + 
			"}";
		}
}