package com.inhe.asset.model;

public class SkAssetPicture {
    private String id;

    private String pic1;

    private String pic2;

    private String pic3;

    private String pic4;

    private String pic5;

    private String pic6;

    private String pic7;

    private String pic8;

    private String pic9;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1 == null ? null : pic1.trim();
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3 == null ? null : pic3.trim();
    }

    public String getPic4() {
        return pic4;
    }

    public void setPic4(String pic4) {
        this.pic4 = pic4 == null ? null : pic4.trim();
    }

    public String getPic5() {
        return pic5;
    }

    public void setPic5(String pic5) {
        this.pic5 = pic5 == null ? null : pic5.trim();
    }

    public String getPic6() {
        return pic6;
    }

    public void setPic6(String pic6) {
        this.pic6 = pic6 == null ? null : pic6.trim();
    }

    public String getPic7() {
        return pic7;
    }

    public void setPic7(String pic7) {
        this.pic7 = pic7 == null ? null : pic7.trim();
    }

    public String getPic8() {
        return pic8;
    }

    public void setPic8(String pic8) {
        this.pic8 = pic8 == null ? null : pic8.trim();
    }

    public String getPic9() {
        return pic9;
    }

    public void setPic9(String pic9) {
        this.pic9 = pic9 == null ? null : pic9.trim();
    }
    
    public String toString(String exceptList){
    	String piclist = "";
    	if(exceptList.indexOf(this.pic1) == -1){
    		piclist +=","+this.pic1; 
    	}
    	if(exceptList.indexOf(this.pic2) == -1){
    		piclist +=","+this.pic2; 
    	}
    	if(exceptList.indexOf(this.pic3) == -1){
    		piclist +=","+this.pic3; 
    	}
    	if(exceptList.indexOf(this.pic4) == -1){
    		piclist +=","+this.pic4; 
    	}
    	if(exceptList.indexOf(this.pic5) == -1){
    		piclist +=","+this.pic5; 
    	}
    	if(exceptList.indexOf(this.pic6) == -1){
    		piclist +=","+this.pic6; 
    	}
    	if(exceptList.indexOf(this.pic7) == -1){
    		piclist +=","+this.pic7; 
    	}
    	if(exceptList.indexOf(this.pic8) == -1){
    		piclist +=","+this.pic8; 
    	}
    	if(exceptList.indexOf(this.pic9) == -1){
    		piclist +=","+this.pic9; 
    	}
    	return piclist.substring(1);
    }
}